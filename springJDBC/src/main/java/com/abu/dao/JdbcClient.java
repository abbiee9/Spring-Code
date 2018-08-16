package com.abu.dao;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcClient {

	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
		
		CustomerDAO dao=(CustomerDAO) ctx.getBean("dao");
		
		Customer cust=new Customer();
		
		//insert
		
		/*cust.setCustId(101);
		cust.setCustname("Abu");
		cust.setBalance(7654);
		
		int n=dao.insert(cust);
		System.out.println(" one record inserteed successfully ");*/
	
		
		/*//Update
	
		cust.setCustname("Abu Talha");
		int n=	dao.update(101,cust);*/
		
		/*//select
		
		cust=dao.findById(102);
		System.out.println(" Records Found with Name :"+cust.getCustname()+ " and Id  "+cust.getCustId()+ " with a balance "+cust.getBalance());*/
		
	/*	//delete
		dao.delete(101);*/
		
		//List
		
		List<Customer> custList = dao.displayAll();
		Iterator<Customer> it=custList.iterator();
		
		System.out.println("\n\n\n");
		while(it.hasNext())
		{
			Customer cust1=it.next();
			
			System.out.println(cust1.getCustname()+ "   "+cust1.getCustId()+ "   "+cust1.getBalance());
			
		}
	
		
		
		
	}

}
