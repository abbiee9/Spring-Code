package com.abu.model;

public class Customer 
{
	private int custId;
	private String custName;
	private double balance;
	private String gender;
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getCustId() 
	{
		return custId;
	}
	public void setCustId(int custId) 
	{
		this.custId = custId;
	}
	public String getCustName()
	{
		return custName;
	}
	public void setCustName(String custName) 
	{
		this.custName = custName;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	
}
