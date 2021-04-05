package com.webstack.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.webstack.springcore.bean.Contact;

@Configuration
@ComponentScan(basePackages = { "com.webstack.springcore" })
public class AppConfig {

	@Bean("contact")
	public Contact getContactBean() {
		Contact contact = new Contact("738702971", "keyurjava@gmail.com");

		return contact;
	}

}
