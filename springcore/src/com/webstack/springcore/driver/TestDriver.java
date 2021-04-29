package com.webstack.springcore.driver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

	public static void main(String[] args) throws ParseException {
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
		
		System.out.println("Before Save");
		
		employeeList.forEach(data->System.out.println(data));
		
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setId(10l);
		employeeDTO.setName("Jigs");
		employeeDTO.setDesignation("Software Engineer");
		employeeDTO.setSalary(80000.0);
		String date1="2020-03-01";  
	    Date dateOfJoininig=new SimpleDateFormat("yyyy-MM-dd").parse(date1); 
		employeeDTO.setDoj(dateOfJoininig);
		employeeDTO.setAge(34);
		
		employeeService.save(employeeDTO);
		
		employeeList = employeeService.list();
		
		System.out.println("After Save");
		
		employeeList.forEach(data->System.out.println(data));
		
		System.out.println("Get Employee with Id 3");
		
		EmployeeDTO newEmployee = employeeService.get(3l);
		
		System.out.println(newEmployee);
		
		System.out.println("Update Employee Id 3 Salary to 140000 ");
		
		newEmployee.setSalary(140000.0);
		
		employeeService.update(newEmployee);
		
		employeeList = employeeService.list();
		
		System.out.println("After Update");
		
		employeeList.forEach(data->System.out.println(data));
		
		System.out.println("Delete Employee 7");
		
		employeeService.delete(7l);
		
		employeeList = employeeService.list();
		
		System.out.println("After Delete");
		
		employeeList.forEach(data->System.out.println(data));
		
	}

}
