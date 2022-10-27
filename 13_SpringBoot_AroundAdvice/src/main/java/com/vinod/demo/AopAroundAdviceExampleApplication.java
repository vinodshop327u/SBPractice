package com.vinod.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy  
public class AopAroundAdviceExampleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(AopAroundAdviceExampleApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(AopAroundAdviceExampleApplication.class, args);  
		// Fetching the employee object from the application context.  
		BankService bank = context.getBean(BankService.class);  
		// Displaying balance in the account  
		String accnumber = "12345";  
		bank.displayBalance(accnumber);  
		// Closing the context object  
		context.close();  
	}

}
