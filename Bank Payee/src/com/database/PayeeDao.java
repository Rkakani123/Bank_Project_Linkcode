package com.database;

import java.sql.Connection;
import java.sql.DriverManager;


import com.model.Payee;

public class PayeeDao 
{
	public int addPayee(Payee p) 
	{
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","123456");
			System.out.println("Connected "+con);

					} 
					catch (Exception e) 
					{
			            e.printStackTrace();
			            return 1;
					}
		return 0;
	}
	/*public static void main(String[] args) 
	{
		Connection con=null;
		int i;
		try {

		//	Class.forName("com.mysql.jdbc.Driver");
			
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","123456");
			System.out.println("Connected "+con);
			PreparedStatement ps=
			con.prepareStatement("insert into payee values(?,?,?,?,?,?)");
			ps.setInt(1,111);
			ps.setInt(2,1111111);
			ps.setString(3,"Varun");
			ps.setString(4,"var123");
			ps.setInt(5,981200007);
			ps.setString(6,"ICICI");
			i=ps.executeUpdate(); 
					} 
					catch (Exception e) 
					{
			            e.printStackTrace();
			            
					}
	}*/
}
