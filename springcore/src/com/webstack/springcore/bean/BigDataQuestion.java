package com.webstack.springcore.bean;

import org.springframework.stereotype.Component;

@Component
public class BigDataQuestion implements IQuestion{

	@Override
	public String question() {
		// TODO Auto-generated method stub
		return "What is BigData?";
	}
	
}
