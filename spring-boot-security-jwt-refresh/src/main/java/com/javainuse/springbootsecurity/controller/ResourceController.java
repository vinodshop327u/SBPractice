package com.javainuse.springbootsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	//http://localhost:9090/hellouser
	@RequestMapping("/hellouser")
	public String getUser()
	{
		return "Hello User";
	}
	//http://localhost:9090/helloadmin
	@RequestMapping("/helloadmin")
	public String getAdmin()
	{
		return "Hello Admin";
	}

}
