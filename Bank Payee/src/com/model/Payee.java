package com.model;

public class Payee 
{
 private int custNo;
 private int accountNo;
 private String name;
 private String username;
 private String mobileNo;
 private String branchName;

   	public Payee(int custNo, int accountNo, String name, String username, String mobileNo, String branchName)
   	{
	super();
	this.custNo = custNo;
	this.accountNo = accountNo;
	this.name = name;
	this.username = username;
	this.mobileNo = mobileNo;
	this.branchName = branchName;
   	}

	public int getCustNo() {
		return custNo;
	}

	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	/*@Override
	public String toString() 
	{
		return "Branch :-\t"+getBranchName()+"\nMobile No :-\t"+getMobileNo()+"\nUsername :-\t"+getUsername()+"\nName:-\t"+getName();
	}*/
}