package com.vinod.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{

	@Autowired  
	private EmployeeService employeeService;  
	//http://localhost:9090/add/employee/empid?empId='101'
	@RequestMapping(value = "/add/employee/empid", method = RequestMethod.GET)  
	public Employee addEmployee(@RequestParam("empId") String empId)// @RequestParam("firstName") String firstName, @RequestParam("secondName") String secondName)   
	{  
		return employeeService.createEmployee1(empId);  // , firstName, secondName);  
	}  
	
	//http://localhost:9090/add/employee?empId='asa'&firstName='vinod'&secondName='chilumuru'
	@RequestMapping(value = "/add/employee", method = RequestMethod.GET)  
	public Employee addEmployee(@RequestParam("empId") String empId, @RequestParam("firstName") String firstName, @RequestParam("secondName") String secondName)   
	{  
		return employeeService.createEmployee(empId, firstName, secondName);  
	} 
}
