package com.vinod.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	//http://localhost:9090//api/javainuse
	@RequestMapping(value = "/api/javainuse")
	public String sayHello() {
		return "<h1>Swagger Hello World</h1>";
	}
}

//http://localhost:9090/swagger-ui.html