package com.webstack.springcore.bean;

import org.springframework.stereotype.Component;

@Component(value = "angularBean")
public class AngularQuestion implements IQuestion {

	@Override
	public String question() {		
		return "What is Angular?";
	}

}
