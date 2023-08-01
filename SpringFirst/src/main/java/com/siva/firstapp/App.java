package com.siva.firstapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		System.out.println("*********");
		Emp emp=context.getBean("emp",Emp.class);
		emp.empInfo();
		Student studen=context.getBean("student",Student.class);
		studen.studenInfo();
	}
}
