package com.ihtc.manage_child;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FAdd extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = new String((req.getParameter("faddname")).getBytes("ISO-8859-1"),"UTF-8");
		String sex = new String((req.getParameter("faddsex")).getBytes("ISO-8859-1"),"UTF-8");
		int age = Integer.parseInt(req.getParameter("faddage"));
		String _name = new String((req.getParameter("fadd_name")).getBytes("ISO-8859-1"),"UTF-8");
		String tel = new String((req.getParameter("faddtel")).getBytes("ISO-8859-1"),"UTF-8");
		
		try {
			if(new ChildDAO().save(new Child(name,sex,age,new Parent(_name,tel)))){
				req.getRequestDispatcher("all").forward(req, resp);
			}
			else{
				resp.sendRedirect("fail.jsp");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}

}