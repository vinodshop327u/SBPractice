package com.vinod.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vinod.model.Employee;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/javainuse-rabbitmq/")
public class RabbitMQWebController 
{
	@Autowired
	private AmqpTemplate amqpTemplate;
	//http://localhost:8080/javainuse-rabbitmq/producer?empName=emp1&empId=12345&salary=50
	@GetMapping(value = "/producer")
	public String producer(@RequestParam("empName") String empName,@RequestParam("empId") String empId,@RequestParam("salary") int salary) {
		
		log.info("employee id----------- "+empId);
		log.info("employee name-------------- "+empName);
		log.info("employee salary-------------- "+salary);
		Employee emp=new Employee();
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		emp.setSalary(salary);

		amqpTemplate.convertAndSend("javainuseExchange", "javainuse", emp);
		return "Message sent to the RabbitMQ Successfully";
	}

}
