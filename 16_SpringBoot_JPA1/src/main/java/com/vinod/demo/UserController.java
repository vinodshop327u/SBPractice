package com.vinod.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.web.bind.annotation.RequestBody;    
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;    
import com.vinod.demo.UserRecord;  
import com.vinod.demo.UserService;  
import java.util.List;

@RestController    
public class UserController
{
	@Autowired    
	private UserService userService;  
	
	//http://localhost:9090
	@RequestMapping("/")    
	public List<UserRecord> getAllUser()  
	{    
		return userService.getAllUsers();    
	}       
	
	//http://localhost:9090/add-user
	@RequestMapping(value="/add-user", method=RequestMethod.POST)    
	public void addUser(@RequestBody UserRecord userRecord)  
	{    
		userService.addUser(userRecord);    
	}    


}


/*
 * 
 * 
 * {  
"id": "001",  
"name": "Tom",  
"email": "tom@gmail.com"  
}  
*/
