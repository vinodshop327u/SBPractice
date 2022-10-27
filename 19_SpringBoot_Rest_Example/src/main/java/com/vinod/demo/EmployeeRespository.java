package com.vinod.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeRespository 
{
	@Autowired
	private IEmployeeRepository _iemployeerepository;
	
	
	public  Employee save(Employee emp) {
		Employee newUser = new Employee();
		//newUser.setUsername(emp.geti);
		//newUser.setPassword(newUser.);
		//System.out.println("---------------------------------"+user.getUsername());
		return _iemployeerepository.save(newUser);
	}


	public List<Employee> findAll() {
		
		List<Employee> newUser = new ArrayList<Employee>();
		newUser.add(new Employee(1,"vinod","car"));
		//newUser.s
//		newUser.setPassword(newUser.);
		return newUser;
	}
	
	public List<Employee> getinfo()
	{
		List<Employee> newUser = new ArrayList<Employee>();
		newUser.add(new Employee(1,"vinod","car"));
		newUser.add(new Employee(2,"jasvin","Jeep"));
		newUser.add(new Employee(3,"dhatri","LORRY"));
		newUser.add(new Employee(4,"subbarao","Activa"));
		newUser.add(new Employee(5,"vijaya","TVS"));
		newUser.add(new Employee(6,"lakshmi","byke"));
		newUser.add(new Employee(7,"satya","scooter"));
		
		return newUser;
	}
	
}
