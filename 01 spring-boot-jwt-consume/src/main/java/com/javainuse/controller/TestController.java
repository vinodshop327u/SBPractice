package com.javainuse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javainuse.model.RegistrationUser;
import com.javainuse.model.ResponseToken;
import com.javainuse.model.User;

@RestController
public class TestController {

	@Autowired
	RestTemplate restTemplate;

	private static final String REGISTRATION_URL = "http://localhost:9082/register";
	private static final String AUTHENTICATION_URL = "http://localhost:9082/authenticate";
	private static final String HELLO_URL = "http://localhost:9082/hello";

	@RequestMapping(value = "/getResponse", method = RequestMethod.GET)
	public String getResponse() throws JsonProcessingException {

		String response = null;
		// create user registration object
		RegistrationUser registrationUser = getRegistrationUser();
		// convert the user registration object to JSON
		String registrationBody = getBody(registrationUser);
		// create headers specifying that it is JSON request
		HttpHeaders registrationHeaders = getHeaders();
		HttpEntity<String> registrationEntity = new HttpEntity<String>(registrationBody, registrationHeaders);
		System.out.println("---------------------------------------42"+registrationEntity.toString());
		try {
			// Register User
			ResponseEntity<String> registrationResponse = restTemplate.exchange(REGISTRATION_URL, HttpMethod.POST,
					registrationEntity, String.class);
			   // if the registration is successful		
			System.out.println("---------------------48"+registrationResponse.getStatusCode().equals(HttpStatus.OK));
			//getResponse
			if (registrationResponse.getStatusCode().equals(HttpStatus.OK)) {
				System.out.println("---------------------enter-----------------51"); 
				// create user authentication object
				User authenticationUser = getAuthenticationUser();
				// convert the user authentication object to JSON
				String authenticationBody = getBody(authenticationUser);
				// create headers specifying that it is JSON request
				HttpHeaders authenticationHeaders = getHeaders();
				HttpEntity<String> authenticationEntity = new HttpEntity<String>(authenticationBody,
						authenticationHeaders);

				// Authenticate User and get JWT
				ResponseEntity<ResponseToken> authenticationResponse = restTemplate.exchange(AUTHENTICATION_URL,
						HttpMethod.POST, authenticationEntity, ResponseToken.class);
					
				// if the authentication is successful		
				System.out.println(" --------------------------------------66 "+authenticationResponse.getStatusCode().equals(HttpStatus.OK));
				// if the authentication is successful		
				if (authenticationResponse.getStatusCode().equals(HttpStatus.OK)) {
					String token = "Bearer " + authenticationResponse.getBody().getToken();
					System.out.println("---------------------------------------------------70"+token);
					HttpHeaders headers = getHeaders();
					headers.set("Authorization", token);
					HttpEntity<String> jwtEntity = new HttpEntity<String>(headers);
					// Use Token to get Response
					ResponseEntity<String> helloResponse = restTemplate.exchange(HELLO_URL, HttpMethod.GET, jwtEntity,
							String.class);
					if (helloResponse.getStatusCode().equals(HttpStatus.OK)) {
						response = helloResponse.getBody();
					}
				}
				
			}
			
				
		}catch(Exception ex)
		{
			System.out.println("exception");
			
		}
		return response;
		
	}
	
	private RegistrationUser getRegistrationUser() {
		RegistrationUser user = new RegistrationUser();
		user.setUsername("jasvin143");
		user.setPassword("jasvin143");
		user.setRole("ROLE_ADMIN");
		return user;
	}

	private User getAuthenticationUser() {
		User user = new User();
		user.setUsername("dhatri");
		user.setPassword("password");
		return user;
	}

	private HttpHeaders getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return headers;
	}

	private String getBody(final User user) throws JsonProcessingException {
		return new ObjectMapper().writeValueAsString(user);
	}
}