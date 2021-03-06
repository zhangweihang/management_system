package com.ihtc.manage_child;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {

	private static final String SAVE = "insert into user values(?,?)";
	
	public static boolean save(User entity) throws SQLException {
		
		if(entity.getName() == null || entity.getName().equals("") || entity.getPassword()== null || entity.getPassword().equals("")){
			return false;
		}
		
		Connection con = DBUtil.getCon();
		PreparedStatement psm = con.prepareStatement(SAVE,Statement.RETURN_GENERATED_KEYS);

		psm = con.prepareStatement(SAVE, Statement.RETURN_GENERATED_KEYS);

		psm.setString(1, entity.getName());
		psm.setString(2, entity.getPassword());
		int times = psm.executeUpdate();
		
		if(times > 0){
			return true;
		}
		
		return false;
		
	}

	public static User findByName(String name) throws SQLException {
	
		Connection con = DBUtil.getCon();
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("select * from user where name = '"+name+"'");
		User user = null;

		if (rs.next()) {
			user = new User(rs.getString("name"), rs.getString("password"));
		}

		if (smt != null) {
			smt.close();
		}
		DBUtil.close();
		
		return user;
	}

}