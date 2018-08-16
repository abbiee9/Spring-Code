package com.abu.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.abu.dao.Customer;
import com.abu.dao.CustomerDAO;
import com.abu.dao.CustomerMapper;

public class CustomerDAOImpl implements CustomerDAO
{
	@Autowired
	private DataSource ds; //it will have the jdbc connection related things bcz of autowire by type
	
	
	private JdbcTemplate jdbc;  //to induce in our prgm we use this
	
	
	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds)
	{
		this.ds = ds;
		this.jdbc=new JdbcTemplate(ds);
	}

	public JdbcTemplate getJdbc() 
	{
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) 
	{
		this.jdbc = jdbc;
	}

	@Override
	public int insert(Customer c) 
	{
		String sql="Insert into customer1(custid,custname,balance) values(?,?,?)";
		int result=jdbc.update(sql,c.getCustId(),c.getCustname(),c.getBalance());
		return result;
	}

	@Override
	public Customer findById(int custId)
	{
		String sql="select * from customer1 where custId=?";
		Customer c=jdbc.queryForObject(sql, new Object[] {custId},new CustomerMapper()); //we give parametrized parameter by creating object of it
		return c;
	}

	@Override
	public List<Customer> displayAll() 
	{
		
			String query = "select * from customer1";
			List<Customer> custList = jdbc.query(query, new CustomerMapper());
			return custList;
	
	}

	@Override
	public int delete(int custId)
	{

		String query = "delete from customer1  where custId=?";
		Object[] args = new Object[] {custId};
		
		int out = jdbc.update(query, args);
		if(out !=0)
		{
			System.out.println("Customer1  deleted with id="+custId);
		}
		else System.out.println("No customer found with id="+custId);
		return out;
		
	}

	@Override
	public int update(int custId,Customer cust) 
	{
		
			String query = "update customer1 set custName=?  where custId=?";
					Object[] args = new Object[] {cust.getCustname(),custId};
			
			int out = jdbc.update(query, args);
			if(out !=0)
			{
				System.out.println("Customer1  updated with id="+custId);
			}
			else System.out.println("No customer found with id="+custId);
			return out;
	}
	

}
