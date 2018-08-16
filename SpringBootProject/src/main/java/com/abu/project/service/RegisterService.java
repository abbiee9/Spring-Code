package com.abu.project.service;

import java.util.Date;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abu.project.dao.RegisterDao;
import com.abu.project.model.Register;

@Service
public class RegisterService 
{

	@Autowired
	RegisterDao dao1;
	
	public RegisterService() 
	{
		
	}

	public boolean userRegister(Register register) 
	{
		/*java.util.Date utilDate = new java.util.Date();
		System.out.println(utilDate);
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		System.out.println(sqlDate);*/
		
		dao1.save(register);
		return true;
		
		
	}

	public Boolean validateUser(String uid, String pwd) 
	{
		Optional<Register> project=dao1.findById(uid);
		
		if(project.get().getPassword().equals(pwd))
		{
			return true;
			}
		else 
			return false;
	}

	public int getUserStatus(String uid) 
	{
		Optional<Register> register=dao1.findById(uid);
		Register r=register.get();
		return r.getLoginstatus();
	}

	public void updateUserStatus(String uid)
	{
		Optional<Register> register=dao1.findById(uid);
		//dao.saveAndFlush
		Register r=register.get();
		r.setLoginstatus(1);
		dao1.saveAndFlush(r);
		
	}

	public boolean logoutUserSession(String uid) 
	{
		
			Optional<Register> register=dao1.findById(uid);
			Register r=register.get();
			r.setLoginstatus(0);
			dao1.saveAndFlush(r);	
			System.out.println("user loggedout succesfully");
			return true;
		
	}

	public Register viewProfile(String uid) 
	{
			Optional<Register> reg=dao1.findById(uid);
			Register r=reg.get();
			return r;
	}

	public boolean userUpdate(Register register)
	{
		/*java.util.Date now = new java.util.Date();
        System.out.println("Value of java.util.Date : " + now);
     
        //converting java.util.Date to java.sql.Date in Java
        java.sql.Date sqlDate = new java.sql.Date(now.getTime());
        System.out.println("Converted value of java.sql.Date : " + sqlDate);
     
        //converting java.sql.Date to java.util.Date back
        java.util.Date utilDate = new java.util.Date(sqlDate.getTime());
        System.out.println("Converted value of java.util.Date : " + utilDate);*/
		Date d=register.getDob();
		System.out.println(" date from database "+d);

		dao1.save(register);
		return true;
		
	}

	
	public Register deleteProfile(String uid) 
	{
		Optional<Register> reg=dao1.findById(uid);
		Register r=reg.get();
		dao1.delete(r);
		return r;
	}
}
