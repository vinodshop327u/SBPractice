package com.vinod.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController
{	
		//http://localhost:9090/hello
		@GetMapping("/hello")
		public String hello()
		{
			return "Hello World!!!";
		}
		
		//http://localhost:9090/customerinfo
		@RequestMapping("/customerinfo")  
		//defines a cache for method's return value  
		//@Cacheable(value="customerInfo")  
		public List customerInformation()  
		{  
		System.out.println("customer information from cache");  
		//adding customer detail in the List  
		    List detail=Arrays.asList
		 (new Customer(5126890,"Charlie Puth","Current A/c", 450000.00),  
		  new Customer(7620015,"Andrew Flintoff","Saving A/c", 210089.00),
		  new Customer(7620016,"Vinod","Saving A/c", 210123.00));  
		  return detail;  
		}  


}
