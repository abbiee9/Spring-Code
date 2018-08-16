package com.abu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerMapper implements RowMapper<Customer>
{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		Customer cust=new Customer();
		cust.setCustId(rs.getInt(1));
		cust.setCustname(rs.getString(2));
		cust.setBalance(rs.getDouble(3));
		
		return cust;
	}

}
