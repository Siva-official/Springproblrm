package com.siva.Thirdapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		// product example with setter and getters...

		Product product = context.getBean("product", Product.class);
		double totalCost = product.getPcost() * product.getQuantity();
		System.out.println("Total bill is = " + totalCost);

		// customer example with constructor....
		Customer customer = context.getBean("customer", Customer.class);

		System.out.println(customer);

	}
}
