package com.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.PayeeDao;

import com.model.Payee;

@WebServlet("/PayeeServlet")
public class PayeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{   
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String CustNo = request.getParameter("c_no");
		int custNo  = Integer.parseInt(CustNo);
		String accNo = request.getParameter("Account");
		int accountNo = Integer.parseInt(accNo);
		
		String name= request.getParameter("Name");
		String username= request.getParameter("Username");
		String mobileNo = request.getParameter("Mo_No");
		String branchName = request.getParameter("BranchName");
		
		Payee p = new Payee(custNo, accountNo, name, username, mobileNo, branchName);
		//System.out.println(p);   //console print
		PayeeDao db = new PayeeDao();
		int i = db.addPayee(p);
		
	    if(i>0)
	    {
	    	out.println("<script type=\"text/javascript\">");
	    	out.println("alert('Record added Sucessfully');");
	    	out.println("window.location.href = \"index.html\";");
	    	out.println("</script>");
	    }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
