package com.abu.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abu.project.dao.ProjectDao;
import com.abu.project.dao.RegisterDao;
import com.abu.project.model.Project;
import com.abu.project.model.Register;


@Service
public class ProjectService 
{
	@Autowired
	ProjectDao dao;

	@Autowired
	RegisterDao dao1;
	
	public ProjectService() 
	{
		
	}

	public String validateAdmin(String uid, String pwd)
	{
		Optional<Project> project=dao.findById(uid);
		String p= project.get().getUsertype();
		if(project.get().getPassword().equals(pwd))
		{
			return p;
			}
		else 
			return "error";
	}

	public void updateStatus(String uid)
	{
		Optional<Project> project=dao.findById(uid);
		//dao.saveAndFlush
		Project p=project.get();
		p.setLoginstatus(1);
		dao.saveAndFlush(p);
		
				
	}

	public int getStatus(String uid) 
	{
		Optional<Project> project=dao.findById(uid);
		Project p=project.get();
		return p.getLoginstatus();
	}

	public boolean logoutSession(String uid) 
	{
		Optional<Project> project=dao.findById(uid);
		Project p=project.get();
		p.setLoginstatus(0);
		dao.saveAndFlush(p);	
		System.out.println("user loggedout succesfully");
		return true;
	}
	
	
}
