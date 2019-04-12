package com.jlu.DAO;

import java.sql.*;

public class DBUtils {
	static public Connection getConnection(){
		Connection conn;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/library";
			conn = DriverManager.getConnection(url, "root", "12345");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		return conn;
	}
}
