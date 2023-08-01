package com.siva.javabaseconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Food food = context.getBean("food", Food.class);
		food.foodInfo();
		Drinks drinks = context.getBean("d1", Drinks.class);
		drinks.drinksInfo();
		Product product = context.getBean("product", Product.class);
		System.out.println(product);
		Customer customer = context.getBean("customer", Customer.class);
		System.out.println(customer.getId() + " " + customer.getName() + " " + customer.getMobile());

	}
}
