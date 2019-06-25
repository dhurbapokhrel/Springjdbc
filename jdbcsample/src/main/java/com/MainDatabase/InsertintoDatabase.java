package com.MainDatabase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.DatabaseHelper.DatabaseHelper;

public class InsertintoDatabase {
	public static void main(String[]args) throws SQLException {
		Connection c = DatabaseHelper.getConnection();
		Statement stmt = c.createStatement();
		
		String insertSql ="insert into Users(User_Id,First_Name,Last_Name,Phone_No,Account_No,Balance) values"
		+ "(112,'Bhanu','Prasad',9857028578,00400501206981,120008);";
		stmt.executeUpdate(insertSql);
	}

}
