package com.webstack.springcore.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.webstack.springcore.bean.Message;
import com.webstack.springcore.config.AppConfig;
import com.webstack.springcore.service.ExamService;
import com.webstack.springcore.service.impl.ExamServiceImpl;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Message messageBean = ctx.getBean(Message.class);
		
		System.out.println(messageBean.getMessage());
		
		messageBean.setMessage("Hi Good Morning...");
		
		Message messageBean1 = ctx.getBean(Message.class);
		
		System.out.println(messageBean1.getMessage());
		
		ExamService examService = ctx.getBean("examServiceImpl",ExamServiceImpl.class);
		
		String question = examService.startExam();
		
		System.out.println("Question Is : "+question);
	}

}
