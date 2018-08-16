package com.casestudy.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.dao.UserDAO;
import com.casestudy.model.User;


@Service
public class UserService 
{
	@Autowired
	UserDAO dao;
	
	//List<User> userList=new ArrayList<User>();
	
	public UserService()
	{
		/*User user1=new User("abu", "qwerty12", "25/10/1995", "7893226953");
		User user2=new User("abbiee", "qwerty123", "03/09/1996", "9651546806");
		
		
		userList.add(user1);
		userList.add(user2);*/
	}
	
	public boolean addUser(User user)
	{
		/*userList.add(user);
		System.out.println(" Size of list "+userList.size());*/
		
		dao.save(user);
		return true;
	}
	
	public List<User> displayAll()
	{
		/*return userList;*/
		return dao.findAll();
	}
	
	public User displayById(String userid)
	{
	
	/*Iterator<User> itr=userList.iterator();
	while(itr.hasNext())
	{
		User u=itr.next();
		
		if(u.getUserName().equals(userid))
			
			return u ;
		
	}
	return null;*/
		
		Optional <User> user=dao.findById(userid);
			
		return user.get();
	}

	public boolean deleteById(String id) 
	{
		/*User user=displayById(id);
		userList.remove(user);
		if(user!=null)
		return true;
		else
			return false;*/
		
		Optional<User> user=dao.findById(id);
		dao.delete(user.get());
		return true;
	}

	public User updateById(String id)
	{
		/*User user=displayById(id);
		//user.setUserName("Apuroop");
		//user.setPassword("12345");
		//user.setDob("23/01/1996");
		//user.setMobile("755647898");
		userList.remove(user);
		return user;*/
		
		Optional<User> user=dao.findById(id);
		//dao.delete(user.get());
		return user.get();
	}

	public boolean saveUpdate(User user)
	{
		/*userList.add(user);*/
		
		dao.saveAndFlush(user);
		return true;
	}

	
}
