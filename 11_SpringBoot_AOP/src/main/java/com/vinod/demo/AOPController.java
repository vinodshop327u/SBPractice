package com.vinod.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AOPController
{
	//http://localhost:9090/hello
	@GetMapping("/hello")
	public String Helloworld()
	{
		return "Hello world!!!!!!!!";
	}
	
	
	
}
