package com.abu.rest.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends Exception 
{
	public UserNotFoundException()
	{
		System.out.println(" user not found ");
	}
}
