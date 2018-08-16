package com.abu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDemo 
{

	public static void main(String[] args) 
	{
		//ApplicationContext guru; //accesseing the spring container
		
		AbstractApplicationContext guru;
		guru= new ClassPathXmlApplicationContext("beans.xml"); //to access confid file
		 
		//Employee emp=(Employee) guru.getBean("emp1");
		Employee emp=(Employee) guru.getBean("emp4");
		/*Employee emp1=(Employee) guru.getBean("emp1");
		Employee emp2=(Employee) guru.getBean("emp1");*/
		
		//Employee emp=guru.getBean(Employee.class,"emp1"); //to access object frm config file
		//Employee emp1=guru.getBean(Employee.class,"e1"); // cant be used as two bean is there so cast is used
		//Employee emp1=guru.getBean("e1",Employee.class); //other way to have been class object and it is always prefered
		
		//Employee emp1=(Employee) guru.getBean("emp2"); 
		
		emp.Display();
		/*emp1.Display();
		emp2.Display();*/
		//emp1.Display();
		
		//guru.registerShutdownHook();

	}

}
