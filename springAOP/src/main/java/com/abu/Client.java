package com.abu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client 
{

	public static void main(String[] args)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("message.xml");
		
		Message msg=ctx.getBean(Message.class);
		msg.bhojpuri();
		

	}

}
