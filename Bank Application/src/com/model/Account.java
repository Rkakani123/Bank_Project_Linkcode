package com.model;

public class Account extends Customer
{
 private int Acc_No;
 private String Acc_Type;
 private String Username;
 private String Password;

public Account(int cust_Id, String cust_Name, String address, int age, long mobile_No, String email, int acc_No,
 String acc_Type, String username, String password) 
{
	super(cust_Id, cust_Name, address, age, mobile_No, email);
	Acc_No = acc_No;
	Acc_Type = acc_Type;
	Username = username;
	Password = password;
}
public int getAcc_no() 
{
	return Acc_No;
}
public void setAcc_no(int acc_no) 
{
	Acc_No = acc_no;
}
public String getAcc_type() 
{
	return Acc_Type;
}
public void setAcc_type(String acc_type) 
{
	Acc_Type = acc_type;
}
public String getUsername() 
{
	return Username;
}
public void setUsername(String username) 
{
	Username = username;
}
public String getPassword() 
{
	return Password;
}
public void setPassword(String password) 
{
	Password = password;
}
}
