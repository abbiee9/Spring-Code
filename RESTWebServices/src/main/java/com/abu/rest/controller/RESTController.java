package com.abu.rest.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.abu.rest.model.User;
import com.abu.rest.service.UserService;
import com.abu.rest.util.UserNotFoundException;


@RestController
public class RESTController 
{
	@Autowired
	UserService service;

	@GetMapping(value="/welcome/{name}")
	public String sayHello(@PathVariable("name") String name)
	{
		return "Hello Mr. " +name+" , welcome to REST";
	}
	
	@GetMapping(value="/user/{id}")
	public User getUser(@PathVariable("id") int id) throws UserNotFoundException
	{
		//User user=new User(6002,"Abu");
		
		User user=service.displayById(id);
		return user;
	}
	
	@GetMapping(value="/display")
	public List<User> display()
	{
			return service.displayAll();
			
	}
	
	/*@GetMapping(value="/add/{uid}/{uname}")
	public String add(@PathVariable("uid") int uid, @PathVariable("uname") String uname)
	{
			service.addUser(uid,uname);
			return "user added";
			
	}*/
	
	@PostMapping(value="/display")
	public ResponseEntity<Object> add(@RequestBody @Valid User user)
	{
		System.out.println("inside post method in controller ");
		User u=service.addUser(user);
		
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(u.getUserId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping(value="/delete/{userId}")
	public String delete(@PathVariable("userId") int uId)
	{
		System.out.println("inside post method in controller ");
		service.deleteUser(uId);
		return "deleted";
	}
	
	@PutMapping(value="/update")
	public String update(@RequestBody @Valid User user) throws UserNotFoundException
	{
		service.updateUser(user);
		return "updated";
	}
	
	
}
