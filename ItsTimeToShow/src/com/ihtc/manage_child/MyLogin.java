package com.ihtc.manage_child;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyLogin extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = new String((req.getParameter("text")).getBytes("ISO-8859-1"),"UTF-8");
		String pwd = new String((req.getParameter("password")).getBytes("ISO-8859-1"),"UTF-8");
		
		try {
			if(UserDAO.findByName(name) != null &&  pwd.equals(UserDAO.findByName(name).getPassword())){
				resp.sendRedirect("all");
			}
			else{
				resp.sendRedirect("login.jsp");		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
