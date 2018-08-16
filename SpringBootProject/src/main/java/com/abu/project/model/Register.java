package com.abu.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(name="user_profile_tbl")
public class Register 
{
	@Id
	@NotEmpty
	@Size(max=10, min=2, message=" User name should be between 2 to 10 character ")
	@Column(length=10)
	private String userId;
	@Column(length=10)
	@Size(max=8, min=4, message=" Password should be between 4 to 8 character ")
	private String password;
	@Column(length=10)
	private String cpassword;
	@Column(length=10)
	private String firstname;
	@Column(length=10)
	private String lastname;
	@Column(length=10)
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date dob;
	@Column(length=10)
	private String gender;
	@Column(length=12)
	private String street;
	@Column(length=12)
	private String location;
	@Column(length=15)
	private String city;
	@Column(length=15)
	private String state;
	@Column(length=6)
	private String pincode;
	@Column(length=10)
	private String mobileno;
	@Column(length=20)
	private String emailid;
	@Column(length=2)
	private int loginstatus;
	
	/*@OneToOne
	@PrimaryKeyJoinColumn
	private Project project1;
		
	public Project getProject1() {
		return project1;
	}
	public void setProject1(Project project1) {
		this.project1 = project1;
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
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getLoginstatus() {
		return loginstatus;
	}
	public void setLoginstatus(int loginstatus) {
		this.loginstatus = loginstatus;
	}
	
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	@Override
	public String toString() {
		return "Register [userId=" + userId + ", password=" + password + ", cpassword=" + cpassword + ", firstname="
				+ firstname + ", lastname=" + lastname + ", dob=" + dob + ", gender=" + gender + ", street=" + street
				+ ", location=" + location + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ ", mobileno=" + mobileno + ", emailid=" + emailid + ", loginstatus=" + loginstatus + ", getUserId()="
				+ getUserId() + ", getPassword()=" + getPassword() + ", getFirstname()=" + getFirstname()
				+ ", getLastname()=" + getLastname() + ", getDob()=" + getDob() + ", getGender()=" + getGender()
				+ ", getStreet()=" + getStreet() + ", getLocation()=" + getLocation() + ", getCity()=" + getCity()
				+ ", getState()=" + getState() + ", getPincode()=" + getPincode() + ", getMobileno()=" + getMobileno()
				+ ", getEmailid()=" + getEmailid() + ", getLoginstatus()=" + getLoginstatus() + ", getCpassword()="
				+ getCpassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}
