package com.vinod.Test.SpringBootH2DB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;

import com.vinod.Test.SpringBootH2DB.model.Student;
import com.vinod.Test.SpringBootH2DB.service.StudentService;  

@RestController
public class StudentController 
{
	@Autowired  
	StudentService studentService;  
	
	//creating a get mapping that retrieves all the students detail from the database   
	@GetMapping("/student")  
	private List<Student> getAllStudent()   
	{  
		return studentService.getAllStudent();  
	}  
	//creating a get mapping that retrieves the detail of a specific student  
	@GetMapping("/student/{id}")  
	private Student getStudent(@PathVariable("id") int id)   
	{  
		return studentService.getStudentById(id);  
	}  
	//creating a delete mapping that deletes a specific student  
	@DeleteMapping("/student/{id}")  
	private void deleteStudent(@PathVariable("id") int id)   
	{  
		studentService.delete(id);  
	}  
	
	//http://localhost:9090/student
	//a New data Save using post method
	@PostMapping("/student")  
	private int saveStudent(@RequestBody Student student)   
	{  
		studentService.saveOrUpdate(student);
		System.out.println(student.getId());
		return student.getId();  
	}  

}
