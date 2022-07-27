package com.vinod.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
//	//http://localhost:9090/hello
//	@RequestMapping("/hello")
//	public String Hello()
//	{
//		return "Helloooooooooo";
//	}
//	
//	//http://localhost:9090/empinfo
//	@GetMapping("empinfo")
//	public List<Employee> getinfo()
//	{
//		List<Employee> getallUserinfo=getEmployeeInfo();
//		
//		return getallUserinfo;
//	}
//	
//	
//	
//	public List<Employee> getEmployeeInfo()
//	{
//		List<Employee> newUser = new ArrayList<Employee>();
//		newUser.add(new Employee(1,"vinod","car"));
//		newUser.add(new Employee(2,"jasvin","Jeep"));
//		newUser.add(new Employee(3,"dhatri","LORRY"));
//		newUser.add(new Employee(4,"subbarao","Activa"));
//		newUser.add(new Employee(5,"vijaya","TVS"));
//		newUser.add(new Employee(6,"lakshmi","byke"));
//		newUser.add(new Employee(7,"satya","scooter"));
//		
//		return newUser;
//	}
}
