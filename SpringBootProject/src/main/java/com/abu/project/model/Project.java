package com.abu.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="user_tbl_credential")
public class Project 
{
	@Id
	@NotEmpty
	@Size(max=10, min=2, message=" User name should be between 2 to 10 character ")
	private String userId;
	
	@Size(max=8, min=4, message=" Password should be between 4 to 8 character ")
	private String password;
	private String usertype;
	private int loginstatus;
	
	/*@OneToOne(mappedBy="user_profile_tbl")
	@Cascade(value=CascadeType.ALL)
	private Register Register1;
		
	public Register getRegister1() {
		return Register1;
	}
	public void setRegister1(Register register1) {
		Register1 = register1;
	}*/
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	
	
	public int getLoginstatus() {
		return loginstatus;
	}
	public void setLoginstatus(int loginstatus) {
		this.loginstatus = loginstatus;
	}
	@Override
	public String toString() {
		return "Project [userId=" + userId + ", password=" + password + ", usertype=" + usertype + ", loginstatus="
				+ loginstatus + "]";
	}
	
	
	
}
