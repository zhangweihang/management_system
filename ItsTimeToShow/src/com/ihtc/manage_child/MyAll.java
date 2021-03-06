package com.ihtc.manage_child;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyAll extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ArrayList<Child> children = null;
		try {
			children = new ChildDAO().findAll();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
		if(children != null && children.size()>0){
		
			req.getSession().setAttribute("myList", children);
			req.getRequestDispatcher("all.jsp").forward(req, resp);
			
		}
		else{
			req.getRequestDispatcher("all.jsp").forward(req, resp);
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
	
}