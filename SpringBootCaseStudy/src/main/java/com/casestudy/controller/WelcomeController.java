package com.casestudy.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.casestudy.model.User;
import com.casestudy.service.UserService;

@Controller
public class WelcomeController 
{
	@Autowired
	UserService service;

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}
	
	@RequestMapping(value="/login" , method=RequestMethod.GET)
	public String welcome()
	{
		System.out.println(" welcome to controller ");
		
		return "login";
	}
	
	@RequestMapping(value="/validatelogin" , method=RequestMethod.POST)
	public String validateUser(@RequestParam("username") String uid,@RequestParam("password") String pwd, ModelMap map)
	{
		map.addAttribute("username", uid);
		if("abu".equals(uid) && "ibm@123".equals(pwd))
		
		return "user";
		else
			return "login";
	}
	
	@RequestMapping(value="/user/{name}/order/{menu}" , method=RequestMethod.GET)
	public String print(@PathVariable("menu") String menuid, @PathVariable("name") String nam,ModelMap map)
	{
		map.addAttribute("umenu", menuid);
		map.addAttribute("uname",nam);
		return "print";
	}
	
	//command bean or backing bean which hold all data which is inserted in from
	
		@RequestMapping(value="/addUser" , method=RequestMethod.GET)
		public String addUser(ModelMap map)
		{
			User user=new User();
			
			map.addAttribute("command", user); //for backing bean so if we do any error then it return to same page with already entered data
			return "adduser";
			
			//return new  ModelAndView("adduser","command", user); 
		}
		
		@RequestMapping(value="/addUser" , method=RequestMethod.POST)
		public String saveuser(@ModelAttribute("command") @Valid User user, BindingResult errors/*, ModelMap map*/)
		{
			/*System.out.println(" user from "+user);*/
			/*map.addAttribute("ab", user);*/
			
			if(errors.hasErrors())
				return "adduser";
			boolean result=service.addUser(user);
			if(result)
			return "redirect:/display";
			else
				return "failed";
		}

		@RequestMapping(value="/display" , method=RequestMethod.GET)
		public String display(ModelMap map)
		{
			
			List<User> users=service.displayAll();
			map.addAttribute("userList", users);
			return "success";
		}
		
		// /display/341
		

		@RequestMapping(value="/display/{id}" , method=RequestMethod.GET)
		public String displayId(@PathVariable("id") String id, ModelMap map)
		{
			String result;
			User user=service.displayById(id);
			map.addAttribute("mu", user);
			if(user==null)
				
			result= "error";
			else
				result="display";
			
			return result;
		}
		
		// /delete/abu
		@RequestMapping(value="/delete/{id}" , method=RequestMethod.GET)
		public String deleteById(@PathVariable("id") String id)
		{
			/*System.out.println(" Deleting for id: "+id);*/
			
			boolean result=service.deleteById(id);
			return "redirect:/display";
		}
		
		@RequestMapping(value="/update/{id}" , method=RequestMethod.GET)
		public String retrieveForUpdate(@PathVariable("id") String id,ModelMap map)
		{
		
			//User user=new User();
		
			User user=service.updateById(id);
			map.addAttribute("command", user);
			return "update";
		}
		
		@RequestMapping(value="/update/save" , method=RequestMethod.POST)
		public String saveUpdate(@ModelAttribute User user)
		{
			service.saveUpdate(user);
			return "redirect:/display";
		}
	
	
}
