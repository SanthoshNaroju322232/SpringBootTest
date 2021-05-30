package com.example.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	
	public UserDao() {
		
		System.out.println("userdao constructor");
	}
	
	
	public boolean register(String name, String place) {
		
		
		System.out.println("records are inserted");
		return true;
	}
	

}
