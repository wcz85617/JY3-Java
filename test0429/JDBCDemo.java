package com.alibaba.tt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemo {

	public static void main(String[] args) {
		
	
			
		    String url = "jdbc:mysql:///myemployees";

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url, "root", "123456");
			
			String str = "SELECT * FROM account";
			
			PreparedStatement prepareStatement = conn.prepareStatement(str);
			
			
			ResultSet rs = prepareStatement.executeQuery();
			
			while(rs.next())
			{
				int int1 = rs.getInt("useId");
				String string = rs.getString("useName");
				double double1 = rs.getDouble("deposit");
				System.out.print(int1+"  ");
				System.out.print(string +"  ");
				System.out.print(double1+"  ");
				System.out.println();
	
			}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
