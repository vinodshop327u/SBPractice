package com.vinod.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustController 
{
	//http://localhost:9090/hello
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello World!!!";
	}
	
	
}
