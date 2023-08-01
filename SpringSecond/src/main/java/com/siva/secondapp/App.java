package com.siva.secondapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    { 	
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
    	
    Operation op=	context.getBean("operation",Operation.class);
    	op.add();
    	op.mul();
    	
    Book book=context.getBean("book",Book.class);
    System.out.println(book.getId()+" ..."+book.getName()+"... "+book.getAuthor());
    	
    }
}
