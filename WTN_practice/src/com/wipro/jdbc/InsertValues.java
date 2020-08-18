package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connecting to the Oracle Data Base");
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","AP@07ca1638");
			System.out.println("Connected");
			Statement stm=conn.createStatement();
			String query="insert into student values(170040857,'Teki Nikhil',9.17)";
			stm.executeUpdate(query);
			query="insert into student values(150030897,'Teki Kundana',9.2)";
			stm.executeUpdate(query);
			query="insert into student values(170030987,'Ram',7.2)";
			stm.executeUpdate(query);
			query="insert into student values(170040001,'Lakshman',9.2)";
			stm.executeUpdate(query);
			query="insert into student values(170040400,'Janaki',9.2)";
			stm.executeUpdate(query);
			System.out.println("inserted into table");
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
