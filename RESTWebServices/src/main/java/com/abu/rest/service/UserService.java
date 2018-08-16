package com.abu.rest.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.abu.rest.model.User;
import com.abu.rest.util.UserNotFoundException;

@Service
public class UserService 
{
	private List<User> userList;
	
	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public UserService()
	{
		userList=new ArrayList<User>();
		
		User user1=new User(6002, "Abu") ;
		User user2=new User(6001, "Murli");
		User user3=new User(6003, "Dhruva");
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
	}
	
	public List<User> displayAll()
	{
		return userList;
		
	}

	public User displayById(int uid) throws UserNotFoundException
	{
	
		Iterator<User> itr=userList.iterator();
		while(itr.hasNext())
		{
			User u=itr.next();
			
			if(u.getUserId()==(uid))
				
				return u ;
			
		}
		/*
		 for(User user:userList)
		 {
		 	if(user.getUserId()==userId)
		 		return user;
		 } */
		throw new UserNotFoundException();
	}

	/*public boolean addUser(int uid,String uname)
	{
		User user=new User(uid,uname);
		userList.add(user);
		return true;
	}*/
	
	public User addUser(User user)
	{
		System.out.println("add user from service");
		userList.add(user);
		return user;
	}
	
	public boolean deleteUser(int uId)
	{
		Iterator<User> itr=userList.iterator();
		while(itr.hasNext())
		{
			User u=itr.next();
			
			if(u.getUserId()==(uId))
			userList.remove(u);
		}
		return true;
	}

	public void updateUser(User user) throws UserNotFoundException 
	{
		User u=displayById(user.getUserId());
		
		userList.remove(u);
		userList.add(user);
		
	}
}
