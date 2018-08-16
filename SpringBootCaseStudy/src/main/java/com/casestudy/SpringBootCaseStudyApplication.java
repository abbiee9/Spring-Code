package com.casestudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootCaseStudyApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootCaseStudyApplication.class, args);
		/*ApplicationContext ctx;
		ctx=SpringApplication.run(SpringBootCaseStudyApplication.class, args);
		
		int num=ctx.getBeanDefinitionCount();
		System.out.println("Number of bean in context "+num);
		
		String[] str=ctx.getBeanDefinitionNames();
		
		System.out.println(" \n\n  List of all defined beans \n");
		
		for(String s:str)
		{
			System.out.println(s);
		}
		*/
		
	}
}
