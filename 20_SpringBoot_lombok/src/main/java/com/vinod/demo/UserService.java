package com.vinod.demo;

import com.vinod.Model.UserName;
import lombok.Builder;

@Builder
public class UserService
{
	public UserName getinfo()
	{
		UserName user1Name=UserName.builder()
				.username("Jasvin")
				.email("jasvin@gmail.com")
				.password("jasvin")
				.phonenumber("jasvin@123")
				.build();
		
		StringBuilder builder = new StringBuilder("Temp");
		String data = builder.append(1)
				.append(true)
				.append("friend")
				.toString();		
		System.out.println("------------------------------"+data);
		
		UserName user=new UserName();
		user.setUsername("vinod");
		user.setEmail("vinod327u@gmail.com");
		user.setPassword("hai");
		user.setPhonenumber("909987");
		return user1Name;
	}

}
