package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.UserService;

@SpringBootApplication
public class FieldInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(FieldInjectionApplication.class, args);
	System.out.println("hii");
	UserService bean = run.getBean(UserService.class);
	 bean.register();
	
	
	}

}
