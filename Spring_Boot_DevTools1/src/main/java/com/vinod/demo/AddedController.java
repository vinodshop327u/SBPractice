package com.vinod.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinod.Model.ApiClientConfiguration;


import lombok.Builder;


@Builder
@RestController
public class AddedController 
{
	
	@GetMapping("/hello")
	public String Hello()
	{
		
		ApiClientConfiguration acc=new ApiClientConfiguration();
		
		return "sdssssssssssssssssssss";
	}
	//http://localhost:8080/hi
	@GetMapping("/hi")
	public ApiClientConfiguration getinfo()
	{
		return m1();
	}
	//output:-{"host":"api.server.com","port":443,"useHttps":false,"connectTimeout":15000,"readTimeout":5000,"username":"myusername","password":"secret"}
	
	public static ApiClientConfiguration m1() {

		ApiClientConfiguration config = ApiClientConfiguration.builder()
			        .host("api.server.com")
			        .port(443)
			        .connectTimeout(15_000L)
			        .readTimeout(5_000L)
			        .username("myusername")
			        .password("secret")
			    .build();
		return config;
	}
	
	
	
	
}
