package com.vinod.Test.SpringBootH2DB.repository;

import org.springframework.data.repository.CrudRepository;

import com.vinod.Test.SpringBootH2DB.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>
{
	
	
}
