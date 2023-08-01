package com.siva.javabase;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Collection collection() {
		Collection collection=new Collection();
		collection.setBooks(Arrays.asList(new Book(1,"spring"),new Book(2, "java")));
		collection.setCs(Arrays.asList(new Customer("siva","siva@gmail.com"),new Customer("raju ", "raju@gmail.com")));
		return collection;
		
	}
		

}
