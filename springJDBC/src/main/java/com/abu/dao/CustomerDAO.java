package com.abu.dao;

import java.util.List;

public interface CustomerDAO 
{
	public int insert(Customer c);
	public Customer findById(int custId);
	public List <Customer> displayAll();
	public int delete(int custId);
	public int update(int custId,Customer cust);
	//public void update(Customer cust);

}
