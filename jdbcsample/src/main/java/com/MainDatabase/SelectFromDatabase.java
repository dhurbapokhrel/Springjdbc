package com.MainDatabase;


import java.sql.ResultSet;
import java.util.Scanner;

import com.DatabaseHelper.DatabaseHelper;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class SelectFromDatabase {
	public static void main(String []args) throws Exception {
		Connection c = (Connection) DatabaseHelper.getConnection();
		Statement stmt = (Statement) c.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter User_Id:");
		
		String Id =sc.next();
		System.out.println("User entered : "+Id);
		
		//Long User_Id = Long.parseLong(Id);
		
		String selectSql="select * from Users where User_Id =" +Id ;
		ResultSet rs =stmt.executeQuery(selectSql);
	
		
		while(rs.next()) {
			int User_Id = rs.getInt("User_Id");
			String First_Name =rs.getString("First_Name");
			String Last_Name =rs.getString("Last_Name");
			long Phone_No=rs.getLong("Phone_No");
			long Account_No=rs.getLong("Account_No");
			long Balance=rs.getLong("Balance");
			
			System.out.println("User Details : User_id = "+User_Id +", First_Name = "+First_Name+", Last_Name = "+Last_Name+
					", Phone_no = "+Phone_No+", Account_No = "+Account_No+", Balance = "+Balance);
		
			
		
			
		}
		
	}
}
