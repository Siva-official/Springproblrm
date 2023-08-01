package com.siva;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	@SuppressWarnings("resource")
		ApplicationContext  context=new ClassPathXmlApplicationContext("spring-config.xml");
    Customer customer=	context.getBean("customer",Customer.class);
       customer.info();	
    }
}
