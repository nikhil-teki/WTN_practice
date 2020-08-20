package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteTableValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connecting to the Oracle Data Base");
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","AP@07ca1638");
			System.out.println("Connected");
			PreparedStatement pstmt=conn.prepareStatement("delete from student where id=?");   
			pstmt.setInt(1,170040400);             
			pstmt.executeUpdate();
			System.out.println("value deleted");
			pstmt.close();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Connection could not be established");
			System.out.println(e);
		}
	}

}
