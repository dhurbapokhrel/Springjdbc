package com.MainDatabase;

import java.util.Scanner;

import com.DatabaseHelper.DatabaseHelper;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class UpdateinDatabase {
	public static void main(String[] args) throws Exception {
		Connection c = (Connection) DatabaseHelper.getConnection();
		Statement stmt = (Statement) c.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer id : ");
	
		String id = sc.next(); 
		//Long User_Id = Long.parseLong(id);
		
		System.out.println("enter new Last_Name : ");
		String Last_Name = sc.next(); 
		
		String updateSql = " update Users set Last_Name = '"+Last_Name + "' where User_Id = " + id;
		stmt.executeUpdate(updateSql);

	}


}
