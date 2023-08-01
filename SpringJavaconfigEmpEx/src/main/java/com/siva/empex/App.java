package com.siva.empex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		// constructor example .....
		Emp emp = context.getBean("emp", Emp.class);
		System.out.println(emp);

	}
}
