package com.webstack.springcore.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	private String name;
	private String city;
	private String mobileNo;
	private String email;

	public String getName() {
		return name;
	}

	@Value(value = "${customer.name}")
	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	@Value(value = "${customer.city}")
	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	@Value(value = "${customer.mobileNo}")
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	@Value(value = "${customer.email}")
	public void setEmail(String email) {
		this.email = email;
	}

}
