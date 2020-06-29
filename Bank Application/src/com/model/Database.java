package com.model;
import java.sql.*;
public class Database 
{
	public static void main(String[] args) 
	{

		try 
		{

Class.forName("mysql.jdbc.OracleDriver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","123456");
System.out.println("Connected "+con);

		} 
		catch (Exception e) 
		{
            e.printStackTrace();
		}
		
	}
}
