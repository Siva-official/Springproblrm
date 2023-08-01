package com.siva.scops;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
// singleton example ....single object for every Bean ...(when we call multipletimes same bean it returns same  object  )
		GoodWish single1 = context.getBean("greet", GoodWish.class);
		single1.greet();
		System.out.println(single1);
		GoodWish single2 = context.getBean("greet", GoodWish.class);
		System.out.println(single2);

		System.out.println("**************");

//prototype example......(when we call multipletimes same bean it creates a new   object and it will be returned  )

		GoodWish2 t1 = context.getBean("greet2", GoodWish2.class);

		System.out.println(t1);

		GoodWish2 t2 = context.getBean("greet2", GoodWish2.class);
		System.out.println(t2);

	}
}
