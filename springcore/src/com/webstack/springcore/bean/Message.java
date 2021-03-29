package com.webstack.springcore.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Message {

	private String message;

	public String getMessage() {
		return message;
	}

	@Value("Hello Radhe Krishna...!")
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
