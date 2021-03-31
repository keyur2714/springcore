package com.webstack.springcore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.webstack.springcore.bean.IQuestion;
import com.webstack.springcore.service.ExamService;

@Component(value = "examServiceImpl")
public class ExamServiceImpl implements ExamService{

	@Autowired
	@Qualifier("bigDataQuestion")
	private IQuestion iQuestion;
	
	@Override
	public String startExam() {		
		return iQuestion.question();
	}

}
