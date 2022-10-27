package com.vinod.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor 
@AllArgsConstructor
@Getter @Setter
@Builder
public class UserName 
{
	
	private String username;
	
	private String password;
	
	private String email;
	
	private String phonenumber;
	
	

}
