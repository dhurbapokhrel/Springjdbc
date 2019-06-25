package com.DatabaseHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {
	public static Connection getConnection() {
		Connection conn= null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not Found.");
			e.printStackTrace();
		}
		
		try {
			conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/wells_fargo_app","root","root@123");
		} catch (SQLException e) {
			System.out.println("Connection not Found.");
			e.printStackTrace();
		}
		return  conn;
	}

}
