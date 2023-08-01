package com.siva.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
  ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml"); 
 Student student= context.getBean("student",Student.class);
  
  System.out.println(student.getSrollno()+" "+student.getSname());
  
    Marks marks=student.getMarks();
    System.out.println(marks.getMaths()+" "+marks.getPhysics()+" "+marks.getSiense());
    
    School school=student.getInfo();
    System.out.println(school.getId()+" "+school.getName()+" "+school.getLocation());
    
    
    }
}
