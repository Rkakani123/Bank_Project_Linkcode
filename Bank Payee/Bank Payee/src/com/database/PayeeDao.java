package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.model.Payee;

public class PayeeDao 
{
	public int addPayee(Payee p) 
	{
		try {
			Connection con;
			Class.forName("com.mysql.jdbc.Driver");

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","123456");
			System.out.println("Connected "+con);
			 PreparedStatement ps=
				    con.prepareStatement("insert into payee values(?,?,?,?,?,?)");
					ps.setInt(1,p.getCustNo());
					ps.setInt(2,p.getAccountNo() );
					ps.setString(3,p.getName());
					ps.setString(4,p.getUsername());
					ps.setString(5,p.getMobileNo());
					ps.setString(6,p.getBranchName());
					int i=ps.executeUpdate(); 
					  if(i>0)
					  {
						System.out.println("record inserted");
					  }
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
			
					} 
					catch (Exception e) 
					{
			            e.printStackTrace();
			            
					}
	}*/
}
