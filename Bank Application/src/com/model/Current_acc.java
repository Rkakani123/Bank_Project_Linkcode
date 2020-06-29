package com.model;

import java.util.Date;

public class Current_acc extends Account 
 {
public Current_acc(int cust_Id, String cust_Name, String address, int age, long mobile_No, String email, int acc_No,
	String acc_Type, String username, String password, Date date_Of_Opening, int over_Draft_Limit,
	String name_OF_Company) 
    {
		super(cust_Id, cust_Name, address, age, mobile_No, email, acc_No, acc_Type, username, password);
		Date_Of_Opening = date_Of_Opening;
		Over_Draft_Limit = over_Draft_Limit;
		Name_OF_Company = name_OF_Company;
	}
private Date Date_Of_Opening;
private int Over_Draft_Limit;
private String Name_OF_Company;

public Date getDate_Of_Opening() 
{
	return Date_Of_Opening;
}
public void setDate_Of_Opening(Date date_Of_Opening) 
{
	Date_Of_Opening = date_Of_Opening;
}
public int getOver_Draft_Limit() 
{
	return Over_Draft_Limit;
}
public void setOver_Draft_Limit(int over_Draft_Limit) 
{
	Over_Draft_Limit = over_Draft_Limit;
}
public String getName_OF_Company() 
{
	return Name_OF_Company;
}
public void setName_OF_Company(String name_OF_Company) 
{
	Name_OF_Company = name_OF_Company;
}
}
