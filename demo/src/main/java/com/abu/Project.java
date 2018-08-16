package com.abu;

public class Project 
{
 private int projId;
 private String projName;
 
public int getProjId() 
{
	return projId;
}
public void setProjId(int projId) 
{
	this.projId = projId;
}
public String getProjName() 
{
	return projName;
}
public void setProjName(String projName) 
{
	this.projName = projName;
}

public void Display()
{
	System.out.println("Project ID :"+projId);
	System.out.println("Project Name: "+projName);
}
 
}
