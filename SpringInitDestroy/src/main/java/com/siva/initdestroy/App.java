package com.siva.initdestroy;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

		MethodsEx ex = context.getBean("method", MethodsEx.class);
		
		ex.midMethod();

		context.close();
		System.err.println("***********");
	}
}
