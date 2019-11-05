package com.web.controller;

import com.analyzer.api.impl.StartBHPCrawingImpl;
import com.analyzer.dao.HousingFormDao;
import com.web.util.GetModels;
import com.analyzer.util.HousingFormUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "StartBHPCrawing", urlPatterns = {"/StartBHPCrawing"})
public class StartBHPCrawing extends HttpServlet{

	@Autowired
	private HousingFormDao housingFormDao;
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
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		StartBHPCrawingImpl start = new StartBHPCrawingImpl();
		start.start();
		
		String page = req.getParameter("page");
		if(page == null || page ==""){
			page = "1";
		}
		HousingFormUtil util = new HousingFormUtil(housingFormDao);
		int n = 15;//一页个数
		
		GetModels models = new GetModels();
  		req.setAttribute("models", models.findByPage(Integer.parseInt(page), util.getHosingEntity(null),n));
		req.setAttribute("pagenum", models.getCount()/n+1);
		req.setAttribute("page", page);
		
		req.getRequestDispatcher("jsp/show.jsp").forward(req, resp);
	}



}
