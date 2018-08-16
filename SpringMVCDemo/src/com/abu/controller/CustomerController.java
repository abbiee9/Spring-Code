package com.abu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.abu.model.Customer;

@Controller
public class CustomerController 
{
	@RequestMapping(value="/customer" ,method=RequestMethod.GET)
	public String createCustomer(ModelMap map) 
	{
		Customer cust=new Customer();
		cust.setBalance(25000); // to set some default value which we get at the field
		map.addAttribute("mama", cust); //as name is command it is also default name
		return "customer";
	}
	
	@RequestMapping(value="/addcustomer" ,method=RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("mama") Customer cust, ModelMap map)  //@modelAttribute Customer cust
	{
		
		map.addAttribute("ab", cust);
		Double c=cust.getBalance();
		Double b=c*1.18;
		map.addAttribute("gross",b );
		return "display";
	}
}
