package com.webstack.springcore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.webstack.springcore.aop.Loggable;
import com.webstack.springcore.bean.IQuestion;
import com.webstack.springcore.service.ExamService;

@Component(value = "examServiceImpl")
public class ExamServiceImpl implements ExamService{

	//Property Injection
	@Autowired
	@Qualifier("bigDataQuestion")
	private IQuestion iQuestion;
	
	//Setter injection
	/*
	 * @Autowired
	 * 
	 * @Qualifier("angularBean") public void setIQuestion(IQuestion iQuestion){
	 * this.iQuestion = iQuestion; }
	 */
	
	//Constructor Injection
	//@Autowired	
	public ExamServiceImpl(@Qualifier("javaQuestion") IQuestion iQuestion) {
		this.iQuestion = iQuestion;
	}
	
	@Loggable
	@Override
	public String startExam() {		
		return iQuestion.question();
	}

}
