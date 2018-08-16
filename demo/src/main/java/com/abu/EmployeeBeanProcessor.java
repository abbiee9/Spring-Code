package com.abu;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class EmployeeBeanProcessor implements BeanPostProcessor
{
public Object postProcessBeforeInitialization(Object bean, String beanName)
{
	System.out.println(" bean is getting ready with id "+beanName+" having hashcode "+bean);
	return bean;
	
}

public Object postProcessAfterInitialization(Object bean, String beanName)
{
	System.out.println("bean "+beanName+" created "+bean);
	return bean;
	
}
}
