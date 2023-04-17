package com.google.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static String URLNAME = "jdbc:mysql://localhost:3306/inHouse";
	private static String DRIVERCLASS = "com.mysql.cj.jdbc.Driver" ;
	private static String USERNAME = "root";
	private  static String PASSWORD = "sumo@123";
	
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName(DRIVERCLASS);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void main(String[] args) {
		Connection conn = getConnection();
		
		if(conn == null) {
			System.out.println("Connection Not Found!");
		}else {
			System.out.println("Connection Found!");
			
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
