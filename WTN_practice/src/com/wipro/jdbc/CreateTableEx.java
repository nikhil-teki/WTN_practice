package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connecting to the Oracle Data Base");
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","AP@07ca1638");
			System.out.println("Connected");
			Statement stm=conn.createStatement();
			String query="create table student(id number(9),name varchar(20),cgpa float(4))";
			stm.executeQuery(query);
			System.out.println("table created");
			stm.close();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Connection could not be established");
			System.out.println(e);
		}
	}

}
