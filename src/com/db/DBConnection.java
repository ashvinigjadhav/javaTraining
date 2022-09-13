package com.db;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/XYZ","root","root123");
			
			PreparedStatement ps =con.prepareStatement("select * from user");
			
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getString("username"));
				System.out.println(rs.getString("password"));
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
