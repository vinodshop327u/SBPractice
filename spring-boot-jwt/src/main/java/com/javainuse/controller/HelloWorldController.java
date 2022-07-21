package com.javainuse.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class HelloWorldController {
//http://localhost:9090/hello
	@RequestMapping({ "/hello" })
	public String hello() {
		return "Hello World";
	}
	//http://localhost:9090/jas
	@RequestMapping({ "/jas" })
	public String hello1() {
		return "Hai jasvin";
	}
	
}
