package com.web.controller;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet(name = "DownLoadInfo", urlPatterns = {"/index/DownLoadInfo"})
public class DownLoadInfo extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        try {
            // 获得用户需要下载文件的名字
            String fileName ="邢少亚.docx";

            // 下载文件所在目录的绝对路径
            String realPath = getServletContext().getRealPath("myinfo/");
            //System.out.println(fileName);

            // 设置为下载application/x-download
            resp.setContentType("application/x-download");

            // 下载文件时显示的文件保存名称
            String fileDisplay = "xsy_"+fileName;
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
        } catch (Exception e) {
            resp.sendRedirect("errorPage.html");
        }

    }
}
