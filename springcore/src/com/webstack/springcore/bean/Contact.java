package com.webstack.springcore.bean;

public class Contact {

	private String mobileNo;
	private String email;

	public Contact(String mobileNo, String email) {
		this.mobileNo = mobileNo;
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public String getEmail() {
		return email;
	}

}
