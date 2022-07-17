package com.vinod.demo;

import org.springframework.stereotype.Component;
import lombok.NonNull;

@Component
public class MessageService 
{
	 public MessageDto getSubscriptionMessage(@NonNull String user) {
		    
		    MessageDto message = new MessageDto();
		    message(12,"hai");
		    //message.
		  //  message.setMessage("Hello "+user+", Thanks for the subscription!");
		  
		    return message;
		  }

	private void message(int i, String string) {
		// TODO Auto-generated method stub
		
	}

}
