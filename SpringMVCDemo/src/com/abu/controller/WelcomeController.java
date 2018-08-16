package com.abu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController 
{
	@RequestMapping(method=RequestMethod.GET, value="/welcome" )
	public String welcome(ModelMap map)
	{
		map.addAttribute("name","Abu");
		map.addAttribute("age", 23);
		map.addAttribute("batch", "J77, SpringCloudMicroservices");
		return "hello";
	}
	
	/*@RequestMapping(method=RequestMethod.GET, value="/kya" )
	public String bye()
	{
		System.out.println(" thanks for coming to spring controller ");
		return "abu";
	}*/
}
