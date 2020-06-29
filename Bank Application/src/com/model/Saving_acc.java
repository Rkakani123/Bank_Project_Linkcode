package com.model;

public class Saving_acc extends Account 
{

public Saving_acc(int cust_Id, String cust_Name, String address, int age, long mobile_No, String email, int acc_No,
			String acc_Type, String username, String password, int interest_Rate, int minimum_Bal) {
		super(cust_Id, cust_Name, address, age, mobile_No, email, acc_No, acc_Type, username, password);
		Interest_Rate = interest_Rate;
		Minimum_Bal = minimum_Bal;
	}
private int Interest_Rate;
private  int Minimum_Bal;

public int getInterest_Rate() 
{
	return Interest_Rate;
}
public void setInterest_Rate(int interest_Rate) 
{
	Interest_Rate = interest_Rate;
}
public int getMinimum_Bal() 
{
	return Minimum_Bal;
}
public void setMinimum_Bal(int minimum_Bal) 
{
	Minimum_Bal = minimum_Bal;
}
}
