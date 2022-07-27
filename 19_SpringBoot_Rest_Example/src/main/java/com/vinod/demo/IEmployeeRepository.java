package com.vinod.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IEmployeeRepository extends JpaRepository<Employee, Integer>
{
	
}
