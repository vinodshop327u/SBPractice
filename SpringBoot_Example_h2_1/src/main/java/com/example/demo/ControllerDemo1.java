package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class ControllerDemo1 
{
	@RequestMapping("/")  
	public String home()  
	{  
	return "home.jsp";  
	}  
	
	@RequestMapping("/hi")  
	public String home1()  
	{  
	return "Hello";  
	}  

}
