package com.webstack.springcore.driver;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.webstack.springcore.bean.Contact;
import com.webstack.springcore.bean.Customer;
import com.webstack.springcore.bean.Message;
import com.webstack.springcore.config.AppConfig;
import com.webstack.springcore.dto.EmployeeDTO;
import com.webstack.springcore.service.EmployeeService;
import com.webstack.springcore.service.ExamService;
import com.webstack.springcore.service.impl.EmployeeServiceImpl;
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
		
		Contact contact = ctx.getBean("contact",Contact.class);
		
		System.out.println(contact.getMobileNo()+" "+contact.getEmail());
		
		System.out.println("===============Property File Reading====================");
		
		Customer customer = ctx.getBean(Customer.class);
		
		System.out.println(customer.getName() + " " +customer.getCity()+ " " + customer.getMobileNo() + customer.getEmail());
		
		Environment env = ctx.getEnvironment();
		
		System.out.println(env.getProperty("db.url"));
		
		System.out.println("=============================");
		
		EmployeeService employeeService = ctx.getBean(EmployeeServiceImpl.class);
		
		List<EmployeeDTO> employeeList = employeeService.list();
		
		employeeList.forEach(data->System.out.println(data));
	}

}
