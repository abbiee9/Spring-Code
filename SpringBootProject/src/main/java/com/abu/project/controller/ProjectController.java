package com.abu.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.abu.project.model.Register;
import com.abu.project.service.ProjectService;
import com.abu.project.service.RegisterService;

@Controller
@SessionAttributes("username")
public class ProjectController 
{
	@Autowired
	ProjectService service;
	
	@Autowired
	RegisterService service1;
	
	

	public ProjectService getService() {
		return service;
	}

	public void setService(ProjectService service) {
		this.service = service;
	}
	
	
	@RequestMapping(value="/login" , method=RequestMethod.GET)
	public String welcome()
	{	
		return "login";
	}
	
	@RequestMapping(value="/validatelogin" , method=RequestMethod.POST)
	public String validateUser(@RequestParam("username") String uid,@RequestParam("password") String pwd, ModelMap map)
	{
		map.addAttribute("username", uid);
		String pro=service.validateAdmin(uid,pwd);
		if(pro.equals("User"))
		{
			int i=service.getStatus(uid);
			if(i==0)
			{
			service.updateStatus(uid);
			return "user";
			}
			else
				return "loginagain";
		
		}
		else if(pro.equals("Admin"))
		{
				int a=service.getStatus(uid);
				if(a==0)
				{
				service.updateStatus(uid);
				return "userAdmin";
				}
				else
					return "loginagain";
		}
		else
			return "login";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(@SessionAttribute("username") String uid)
	{
		System.out.println("inside logout controller "+uid);
		boolean b=service.logoutSession(uid);
		if(b)
		return "logout";
		else
			return null;
	}
	
	@RequestMapping(value="/getuser")
	public String getProfile()
	{
		return "getuser";
	}
	
	@RequestMapping(value="/viewuser", method=RequestMethod.POST)
	public String viewProfile(@RequestParam("userid") String uid,ModelMap map)
	{
		
		Register re=service1.viewProfile(uid);
		map.addAttribute("command",re);
		return "viewuserprofile";
		
	}
	
	@RequestMapping(value="/getdeleteuser")
	public String getProfileForDelete()
	{
		return "getdeleteuser";
	}
	
	@RequestMapping(value="/deleteuser",method=RequestMethod.POST)
	public String  deleteProfile(@RequestParam("userid") String uid,ModelMap map)
	{
		Register r=service1.deleteProfile(uid);
			return "deleteuser";
	}
	

}
