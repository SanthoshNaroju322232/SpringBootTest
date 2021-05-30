package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;

@Service
public class UserService {
	
public UserService() {
		
		System.out.println("UserService constructor");
	}
	
	
	@Autowired
	private UserDao dao;
	
	public void register() {
		
		boolean register = dao.register("santhoshNaroju","Siddipet");
		
		if(register) {
			System.out.println("records inserted successfully");
		}else {
			
			System.out.println("insertion failed");
		}
		
		
		System.out.println(register);
	}

}
