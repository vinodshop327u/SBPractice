package com.vinod.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect
{
	@After(value = "execution(* com.vinod.demo.EmployeeService.*(..)) and args(empId, fname, sname)")  
	public void afterAdvice(JoinPoint joinPoint, String empId, String fname, String sname) 
	{  
		
		System.out.println("After method:" + joinPoint.getSignature());  
		System.out.println("Creating Employee with first name - " + fname + ", second name - " + sname + " and id - " + empId);  
	} 

	@Before(value = "execution(* com.vinod.demo.EmployeeService.*(..)) and args(empId, fname, sname)")  
	public void beforeAdvice(JoinPoint joinPoint, String empId, String fname, String sname) 
	{  
		String empid1="102";
		empId=empid1;		
		System.out.println("Before method:" + joinPoint.getSignature());  
		System.out.println("Creating Employee with first name - " + fname + ", second name - " + sname + " and id - " + empId);  
	} 

}
