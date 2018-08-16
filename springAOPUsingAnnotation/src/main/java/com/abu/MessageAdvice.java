package com.abu;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MessageAdvice 
{
	@Pointcut("execution(* com.abu.*.*(..))")
	private void dis()
	{
		
	}
	@Before("dis()")
	public void before()
	{
		System.out.println(" Welcome to India");
	}
	
	@After("dis()")
	public void after()
	{
		System.out.println("  Thanks for visiting India  ");
	}
}
