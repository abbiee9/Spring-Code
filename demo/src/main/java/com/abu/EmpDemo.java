package com.abu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpDemo 
{

	public static void main(String[] args) 
	{
		ApplicationContext context;
		
		context=new AnnotationConfigApplicationContext(EmployeeBeanConfig.class); //to access the configuration file
		
		
		
		//Employee e=context.getBean(Employee.class); //to get the object of bean class
		//Employee e=(Employee) context.getBean("getEmp");
		Employee e=context.getBean("getEmp",Employee.class);
		e.Display();

	}

}
