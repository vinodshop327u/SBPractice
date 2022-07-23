package com.vinod.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)  
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(Application.class, args);  
		//Fetching the account object from the application context  
		AccountService accountService = ac.getBean("accountServiceImpl", AccountServiceImpl.class);  
		Account account;  
		try   
		{  
			//generating exception  
			//account = accountService.getAccountByCustomerId(null);  
			account = accountService.getAccountByCustomerId("10441117000");  
			
			if(account != null)  
				System.out.println(account.getAccountNumber()+"\t"+account.getAccountType());  
		}   
		catch (Exception e)   
		{  
			System.out.println(e.getMessage());  
			e.printStackTrace();  
		}  
	}  
}

