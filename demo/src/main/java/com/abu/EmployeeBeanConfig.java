package com.abu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //for identifying it as a configuration file
public class EmployeeBeanConfig 
{
	@Bean   //for creating an object
	public Employee getEmp()
	{
		Project proj=new Project();
		proj.setProjId(70);
		proj.setProjName("P & G");

		Employee emp=new Employee();
		emp.setEmpId(123);
		emp.setEmpName("Abu");
		emp.setSalary(21000);
		emp.setProj(proj); //this is same like autowire
		return emp;
		
		
	}
	
	@Bean   //for creating an object
	public Employee getEmp1()
	{
		Project proj=new Project();
		proj.setProjId(121);
		proj.setProjName("P & T");

		Employee emp=new Employee();
		emp.setEmpId(6001);
		emp.setEmpName("Murli");
		emp.setSalary(21000);
		emp.setProj(proj); //this is same like autowire
		return emp;
		
		
	}
}
