package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Premium;

public class DBConnection {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shilpa", "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
		
	}

	public static void update(String sql) throws SQLException {

		Statement stmt = null;
		Connection con = null;
		con = DBConnection.getConnection();
		stmt = con.createStatement();
		stmt.executeUpdate(sql);
	}

	public static List<Premium> select() throws SQLException {
		String sql="SELECT * FROM `premium`";

		
		Statement stmt = null;
		Connection con = null;
		ResultSet rs = null;
		con = DBConnection.getConnection();
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		
		List<Premium> premiums = new ArrayList<Premium>();
		
		while (rs.next()) {
			premiums.add(new Premium(rs.getString("policy"),rs.getInt("premium")));
		}
		return premiums;
	}
	
	public static void main(String[] args) throws SQLException {
		List<Premium> premiums = select();
		for(Premium premium : premiums) {
			System.out.println(premium);
		}
	}
}
