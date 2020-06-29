package com.model;

public class Customer 
{
private int Cust_Id;
private String Cust_Name;
private String Address;
private int age;
private long Mobile_No;
private String Email;
public Customer(int cust_Id, String cust_Name, String address, int age, long mobile_No, String email) 
{
	super();
	Cust_Id = cust_Id;
	Cust_Name = cust_Name;
	Address = address;
	this.age = age;
	Mobile_No = mobile_No;
	Email = email;
}
public int getCust_Id() 
{
	return Cust_Id;
}
public void setCust_Id(int cust_Id) 
{
	Cust_Id = cust_Id;
}
public String getCust_Name() 
{
	return Cust_Name;
}
public void setCust_Name(String cust_Name) 
{
	Cust_Name = cust_Name;
}
public String getAddress() 
{
	return Address;
}
public void setAddress(String address) 
{
	Address = address;
}
public int getAge() 
{
	return age;
}
public void setAge(int age) 
{
	this.age = age;
}
public long getMobile_No() 
{
	return Mobile_No;
}
public void setMobile_No(long mobile_No) 
{
	Mobile_No = mobile_No;
}
public String getEmail() 
{
	return Email;
}
public void setEmail(String email) 
{
	Email = email;
}
}
