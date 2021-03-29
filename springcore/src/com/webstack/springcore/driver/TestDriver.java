package com.webstack.springcore.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.webstack.springcore.bean.Message;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Message.class);
		
		Message messageBean = ctx.getBean(Message.class);
		
		System.out.println(messageBean.getMessage());
	}

}
