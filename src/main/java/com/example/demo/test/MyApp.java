package com.example.demo.test;

import java.lang.reflect.Field;

public class MyApp {
public static void main(String[] args) throws Exception {
	
	Class<?> clz = Class.forName("com.example.demo.test.App");
	
	Field agefield = clz.getDeclaredField("age");
	Field nofield = clz.getDeclaredField("no");
	
	agefield.setAccessible(true);
	nofield.setAccessible(true);
	
	Object object = clz.newInstance();
	
	agefield.set(object, 50);
	nofield.set(object, 20);
	
	System.out.println(agefield.get(object));
	System.out.println(nofield.get(object));
}
}
