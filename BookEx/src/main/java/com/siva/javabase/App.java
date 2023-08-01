package com.siva.javabase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
    Collection collection=	context.getBean("",Collection.class);
collection.getBooks().forEach(book->System.out.println(book));
    }
}
