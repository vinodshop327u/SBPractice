package com.vinod.demo;

import org.springframework.stereotype.Service;

@Service  
public class EmployeeService 
{
	public Employee createEmployee( String empId, String fname, String sname)   
	{  
		Employee emp = new Employee();  
		emp.setEmpId(empId);  
		emp.setFirstName(fname);  
		emp.setSecondName(sname);  
		return emp;  
	}  
	public void deleteEmployee(String empId)   
	{  
	}
	public Employee createEmployee1(String empId) {
		Employee emp = new Employee();  
		emp.setEmpId(empId);  
		emp.setFirstName("vinod");  
		emp.setSecondName("chilumuru");  
		return emp;  
	}  

}
