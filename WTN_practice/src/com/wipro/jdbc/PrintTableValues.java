package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PrintTableValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connecting to the Oracle Database");
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","AP@07ca1638");
			System.out.println("Connected");
			Statement stm=conn.createStatement();
			String query="select * from student";
			ResultSet rs=stm.executeQuery(query);
			System.out.println("ID\tName\tCGPA");
			while(rs.next())
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
		}
		catch(Exception e)
		{
			System.out.println("Connection could not be established");
			System.out.println(e);
		}
	}

}
