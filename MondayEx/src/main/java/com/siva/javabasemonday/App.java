package com.siva.javabasemonday;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config1.class, Config2.class);
	Emp emp= context.getBean("emp",Emp.class);
	emp.info();
	
Student student=	context.getBean("student",Student.class);
	
student.info();
	}
}
