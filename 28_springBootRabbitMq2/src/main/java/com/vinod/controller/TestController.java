package com.vinod.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController 
{
	@GetMapping("/hai")
	public String getinfo()
	{
		return "<h1>hai--------------hai</h1>"; 
	}

}
