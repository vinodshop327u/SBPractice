package com.vinod.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
	@Autowired    
	private UserRepository userRepository;    
	public List<UserRecord> getAllUsers()  
	{    
	List<UserRecord>userRecords = new ArrayList<>();    
	userRepository.findAll().forEach(userRecords::add);    
	return userRecords;    
	}    
	public void addUser(UserRecord userRecord)  
	{    
		 
		System.out.println(userRecord.getId()+"   "+userRecord.getEmail()+"  "+userRecord.getName());
		userRepository.save(userRecord);    
	}    
}
