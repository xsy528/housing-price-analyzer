package com.web.util;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GoOtherView extends HttpServlet{

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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
			try {
				String id = request.getParameter("id");
		  if("indexSuccess".equals(id)){
						  request.getRequestDispatcher("WEB-INF/jsp/indexSuccess.jsp").forward(request, response);
		  }else if("detail".equals(id)){
						  response.sendRedirect("jsp/detail.jsp");
		  }else if("forgetpassword".equals(id)){
						  response.sendRedirect("jsp/forgetpassword.jsp");
		  }else if("success".equals(id)){
						  request.getRequestDispatcher("WEB-INF/jsp/success.jsp").forward(request, response);
		  }else if("confirm".equals(id)){
						  request.getRequestDispatcher("WEB-INF/jsp/confirm.jsp").forward(request, response);
		  }else if("addbook".equals(id)){
						  request.getRequestDispatcher("WEB-INF/super/addbook.jsp").forward(request, response);
		  }else if("deletebook".equals(id)){
						  request.getRequestDispatcher("WEB-INF/super/deletebook.jsp").forward(request, response);
		  }else if("emptycar".endsWith(id)){
						  request.getRequestDispatcher("WEB-INF/jsp/emptyCar.jsp").forward(request, response);
		  }
			} catch (Exception e) {
				response.sendRedirect("errorPage.html");
				e.printStackTrace();
			}
		  
	}

}
