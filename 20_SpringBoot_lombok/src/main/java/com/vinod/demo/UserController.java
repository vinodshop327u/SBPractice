package com.vinod.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
	@GetMapping("/hello")
	public String Hello()
	{
		 
		return "Hello World!!!!";
	}

}
