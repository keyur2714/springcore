package com.webstack.springcore.bean;

import org.springframework.stereotype.Component;

@Component
public class JavaQuestion implements IQuestion{

	@Override
	public String question() {		
		return "What is Java?";
	}

	
}
