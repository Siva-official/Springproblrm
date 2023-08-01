package com.siva.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	
    	ApplicationContext  context=new ClassPathXmlApplicationContext("spring-config.xml");
    Properties properties=	context.getBean("properties",Properties.class);
    System.out.println(properties);
    
    }
}
