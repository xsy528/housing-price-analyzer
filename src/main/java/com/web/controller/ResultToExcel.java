package com.web.controller;

import com.analyzer.dao.HousingFormDao;
import com.analyzer.dao.entity.HousingFormEntity;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ResultToExcel", urlPatterns = {"/index/ResultToExcel"})
public class ResultToExcel extends HttpServlet{
	private final Logger LOG = LoggerFactory.getLogger(ResultToExcel.class);
	@Autowired
	private HousingFormDao housingFormDao;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		try{
			createExcel();
			// 获得用户需要下载文件的名字
			String fileName ="housing-price.xlsx";

			// 下载文件所在目录的绝对路径
			String realPath = getServletContext().getRealPath("excel/");

			// 设置为下载application/x-download
			resp.setContentType("application/x-download");

			// 下载文件时显示的文件保存名称
			String fileDisplay = "0111_"+fileName;
			// 中文编码转换
			fileDisplay = URLEncoder.encode(fileDisplay, "UTF-8");

			//设置响应头部信息
			resp.addHeader("Content-Disposition", "attachment;filename="+fileDisplay);
			try {
				ServletOutputStream out = resp.getOutputStream();
				File file = new File(realPath,fileName);
				FileInputStream in = new FileInputStream(file);
				byte[] b = new byte[1024];
				int len = -1;
				while ((len = in.read(b)) != -1) {
					out.write(b, 0, len);
				}
				out.flush();
				in.close();
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
            req.getRequestDispatcher("index/show2.jsp").forward(req, resp);
		}catch (Exception e){
			LOG.error(e.getMessage());
			resp.sendRedirect("errorPage.html");
		}

	}
	public void createExcel() throws WriteException,IOException{
		OutputStream os = new FileOutputStream("src/main/webapp/excel/housing-price.xlsx");
		//创建工作薄
		WritableWorkbook workbook = Workbook.createWorkbook(os);
		//创建新的一页
		WritableSheet sheet = workbook.createSheet("First Sheet",0);
		//创建要显示的内容,创建一个单元格，第一个参数为列坐标，第二个参数为行坐标，第三个参数为内容

		Label label1 = new Label(0,0,"ID");
		sheet.addCell(label1);
		Label label2 = new Label(1,0,"区域");
		sheet.addCell(label2);
		Label label3 = new Label(2,0,"房源名称");
		sheet.addCell(label3);
		Label label4 = new Label(3,0,"月租金");
		sheet.addCell(label4);
		Label label5 = new Label(4,0,"版式");
		sheet.addCell(label5);
		Label label6 = new Label(5,0,"面积（平米）");
		sheet.addCell(label6);
		Label label7 = new Label(6,0,"描述");
		sheet.addCell(label7);
		Label label8 = new Label(7,0,"具体位置");
		sheet.addCell(label8);
		Label label9 = new Label(8,0,"来源网站");
		sheet.addCell(label9);

		//行数
		List<HousingFormEntity> all = housingFormDao.findAll();
		for (int i = 0;i<all.size();i++){
			HousingFormEntity entity = all.get(i);
			Label label = new Label(0,i,entity.getId()+"");
			sheet.addCell(label);
			label = new Label(1,i,entity.getRegion());
			sheet.addCell(label);
			label = new Label(2,i,entity.getName());
			sheet.addCell(label);
			label = new Label(3,i,entity.getPrice()+"");
			sheet.addCell(label);
			label = new Label(4,i,entity.getFormat());
			sheet.addCell(label);
			label = new Label(5,i,entity.getArea()+"");
			sheet.addCell(label);
			label = new Label(6,i,entity.getDesc());
			sheet.addCell(label);
			label = new Label(7,i,entity.getLocation());
			sheet.addCell(label);
			label = new Label(8,i,getWebName(entity.getWebId()));
			sheet.addCell(label);
		}


		//把创建的内容写入到输出流中，并关闭输出流
		workbook.write();
		workbook.close();
		os.close();
	}
	private String getWebName(int web_id){
		switch (web_id){
			case 1: return "58同城";
			case 2: return "安居客";
			case 3: return "房天下";
			case 4: return "我爱我家";
			case 5: return "自如网";
			default: return "";
		}

	}
}
