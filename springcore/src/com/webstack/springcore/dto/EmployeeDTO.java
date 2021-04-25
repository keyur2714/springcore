package com.webstack.springcore.dto;

import java.util.Date;

public class EmployeeDTO {
	private Long id;
	private String name;
	private String desingation;
	private Double salary;
	private Date doj;
	private Integer age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesingation() {
		return desingation;
	}

	public void setDesingation(String desingation) {
		this.desingation = desingation;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", name=" + name + ", desingation=" + desingation + ", salary=" + salary
				+ ", doj=" + doj + ", age=" + age + "]";
	}

	
}
