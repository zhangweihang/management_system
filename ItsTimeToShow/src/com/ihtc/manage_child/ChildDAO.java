package com.ihtc.manage_child;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ChildDAO implements MyDAO<Child,Integer>{
	
	private static final String SAVE = "insert into children values(null,?,?,?,?,?)";
	
	@Override
	public boolean save(Child entity) throws SQLException {

		if(entity.getName() == null || entity.getName().equals("") || entity.getParent() == null || 
				entity.getParent().getName() == null || entity.getParent().getName().equals("") ||
				entity.getParent().getTel() == null || entity.getParent().getTel().equals("")){
				
				return false;
				
		}
		
		Connection con = DBUtil.getCon();
		PreparedStatement psm = con.prepareStatement(SAVE,Statement.RETURN_GENERATED_KEYS);

		psm.setString(1, entity.getName());
		psm.setString(2, entity.getSex());
		psm.setInt(3, entity.getAge());
		psm.setString(4, entity.getParent().getName());
		psm.setString(5, entity.getParent().getTel());
		int times = psm.executeUpdate();

		if (psm != null) {
			psm.close();
		}

		DBUtil.close();

		if(times > 0){
			return true;
		}

		return false;
		
	}

	@Override
	public boolean update(Child entity) throws SQLException {

		if(entity.getName() == null || entity.getName().equals("") || entity.getParent() == null || 
				entity.getParent().getName() == null || entity.getParent().getName().equals("") ||
				entity.getParent().getTel() == null || entity.getParent().getTel().equals("")){
				
				return false;
				
		}
		
		Connection con = DBUtil.getCon();
		Statement smt = con.createStatement();
		
		int times = smt.executeUpdate("update children set name ='"+entity.getName()+
				"',sex='"+entity.getSex()+"',age="+entity.getAge()+",p_name='"+
				entity.getParent().getName()+"',tel='"+entity.getParent().getTel()+
				"' where id="+entity.getId());
		
		if(smt != null){
			smt.close();
		}
		
		DBUtil.close();
		
		if(times > 0){
			return true;
		}
		
		return false;
		
	}

	@Override
	public boolean delete(Integer id) throws SQLException {

		Connection con = DBUtil.getCon();
		Statement smt = con.createStatement();
		int times = smt.executeUpdate("delete from children where id = "+id);
			
		if(smt != null){
			smt.close();
		}
		DBUtil.close();
	
		if(times>0){
			return true;
		}
		
		return false;
	
	}

	@Override
	public Child findById(Integer id) throws SQLException {

		Connection con = DBUtil.getCon();
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("select * from children where id = "+id);
		Child child = null;
	
		if(rs.next()){
			child = new Child(rs.getInt("id"),rs.getString("name"),rs.getString("sex"),
					rs.getInt("age"),new Parent(rs.getString("p_name"),rs.getString("tel")));
				
		}
			
		if(smt != null){
			smt.close();
		}
		DBUtil.close();
		
		return child;
		
	}

	@Override
	public ArrayList<Child> findAll() throws SQLException {

		Connection con = DBUtil.getCon();
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("select * from children");
		ArrayList<Child> children = new ArrayList<>();
		Child child = null;
	
		while(rs.next()){
			
			child = new Child(rs.getInt("id"),rs.getString("name"),rs.getString("sex"),
					rs.getInt("age"),new Parent(rs.getString("p_name"),rs.getString("tel")));
			children.add(child);
			
		}
			
		if(smt != null){
			smt.close();
		}
		DBUtil.close();
		return children;
		
	}
	
}
