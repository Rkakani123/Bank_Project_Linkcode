package com.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Accountcontroller")
public class Accountcontroller extends HttpServlet 
{
	private static final long serialVersionUID = 1L;


    public Accountcontroller(int cust_Id, String cust_Name, String address, int age, long mobile_No, String email, int acc_No,
    		 String acc_Type, String username, String password) 
    {
       super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int i=0;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String Cust_Name = request.getParameter("C_Name");
		String User_Id = request.getParameter("C_Id");
		int Cust_Id = Integer.parseInt(User_Id);
		String Cust_Age = request.getParameter("C_age");
		int Age = Integer.parseInt(Cust_Age);
		String Aadhar_No = request.getParameter("Aadhar_No");
		long Aadhar = Long.parseLong(Aadhar_No);
		String Address = request.getParameter("Add");
		String Mobile_No = request.getParameter("Mo_No");
		long Mo_No = Long.parseLong(Mobile_No);
		String Email = request.getParameter("Email");
		String Account_Type = request.getParameter("Account_type");
		
		Account a = new Account(Cust_Id, Cust_Name, Address, Age, Mobile_No, Email, Aadhar, Account_Type);
		Database db = new Database(); 
	    if(i>0)
	    {
	    	out.println("<script type=\"text/javascript\">");
	    	out.println("alert('Account Created Sucessfully');");
	    	out.println("window.location.href = \"Register.html\";");
	    	out.println("</script>");
	    }
}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		
	}

}
