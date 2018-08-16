package com.abu.project.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.abu.project.model.Register;
import com.abu.project.service.RegisterService;

@Controller
@SessionAttributes("username")
public class RegisterController 
{
	@Autowired
	RegisterService service;
	
	public RegisterService getService() {
		return service;
	}

	public void setService(RegisterService service) {
		this.service = service;
	}

	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register(ModelMap map)
	{
		Register register=new Register();
		
		map.addAttribute("command", register);
		return "register";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveRegister(@ModelAttribute("command") @Valid Register register, BindingResult errors)
	{
		
		if(errors.hasErrors())
			return "register";
		service.userRegister(register);
		return "redirect:/loginuser";
		
		
	}
	
	@RequestMapping(value="/loginuser", method=RequestMethod.GET)
	public String loginuser() 
	{
		return "userlogin";
	}
	
	@RequestMapping(value="/validateUserLogin" , method=RequestMethod.POST)
	public String validateUserLogin(@RequestParam("userid") String uid,@RequestParam("password") String pwd, ModelMap map)
	{
		map.addAttribute("username", uid);
		Boolean pro=service.validateUser(uid,pwd);
		if(pro)
		{
			int i=service.getUserStatus(uid);
			if(i==0)
			{
				service.updateUserStatus(uid);
				return "userProfile";
			}
			else
				return "userloginagain";
		}
		else
			return "userlogin";
		
	}
	
	@RequestMapping(value="/logoutuser", method=RequestMethod.GET)
	public String logout(@SessionAttribute("username") String uid)
	{
		System.out.println("inside logout controller "+uid);
		boolean b=service.logoutUserSession(uid);
		if(b)
		return "logoutuser";
		else
			return null;
	}
	
	@RequestMapping(value="/display", method=RequestMethod.GET)
	public String getProfile(@SessionAttribute("username") String uid,ModelMap map)
	{
		
		Register reg=service.viewProfile(uid);
		map.addAttribute("command",reg);
		return "viewprofile";
		
	}
	@RequestMapping(value="/updateprofile", method=RequestMethod.GET)
	public String updateProfile(@SessionAttribute("username") String uid,ModelMap map)
	{
		
		Register re=service.viewProfile(uid);
		map.addAttribute("command",re);
		return "updateprofile";
		
	}
	@RequestMapping(value="/saveUpdate", method=RequestMethod.POST)
	public String saveUpdate(@ModelAttribute("command") @Valid Register register, BindingResult errorss)
	{
		
		if(errorss.hasErrors())
			return "updateprofile";
		service.userUpdate(register);
		return "redirect:/loginuser";
		
		
	}
	
	/*@RequestMapping(value="/changepwd")
	public String changePassword(@ModelAttribute Register register,ModelMap map)
	{
		service.changePassword(Register register);
		return "changepwd";
	}*/
}
