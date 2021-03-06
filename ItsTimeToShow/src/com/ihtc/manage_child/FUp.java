package com.ihtc.manage_child;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FUp extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("fid"));
		String name = new String((req.getParameter("fname")).getBytes("ISO-8859-1"),"UTF-8");
		String sex = new String((req.getParameter("fsex")).getBytes("ISO-8859-1"),"UTF-8");
		int age = Integer.parseInt(req.getParameter("fage"));
		String _name = new String((req.getParameter("f_name")).getBytes("ISO-8859-1"),"UTF-8");
		String tel = new String((req.getParameter("ftel")).getBytes("ISO-8859-1"),"UTF-8");
		
		try {
			if( new ChildDAO().update(new Child(id,name,sex,age,new Parent(_name,tel)))){
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