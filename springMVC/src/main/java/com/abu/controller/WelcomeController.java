package com.abu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController 
{
	
	@RequestMapping(method=RequestMethod.GET, value="/hello" )
	public String sayhello()
	{
		System.out.println(" welcome to spring controller ");
		
		return "welcome";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/kya" )
	public String bye()
	{
		System.out.println(" thanks for coming to spring controller ");
		return "abu";
	}
	
}
