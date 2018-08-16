package com.abu.rest.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User 
{
	//@XmlElement
	@Max(value=9999, message=" maximum value should be 9999")
	@Min(value=1111, message=" minimum value should be 1111")
	private int userId;
	
	@Size(min=3 ,max=10 ,message=" user name should be min 3 and max 10 ")
	private String username;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public User() 
	{
		
	}
	
	public User(int uid,String name) 
	{
		this.userId=uid;
		this.username=name;
	}
	
}
