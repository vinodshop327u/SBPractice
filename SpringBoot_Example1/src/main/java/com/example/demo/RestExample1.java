package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;

@RestController
public class RestExample1 
{
	@GetMapping //http://localhost:8080/
	public String GetInfo()
	{
		return "welcome to SpringBoot ";
	}
	
	@GetMapping("/hello")
	public List<Employee>  GetEmployeeInfo()
	{
		List<Employee> l=getinfo();
		return l;
	}//http://localhost:8080/hello
	
	public static List<Employee> getinfo()
	{
		List<Employee> list= new ArrayList<Employee>();
		list.add(new Employee(1,"vinod","vinod@gmail.com"));
		list.add(new Employee(1,"dhatri","dhatri@gmail.com"));
		list.add(new Employee(1,"jasvin","jasvin@gmail.com"));
		list.add(new Employee(1,"sai","sai@gmail.com"));
		return list;
	}
}
