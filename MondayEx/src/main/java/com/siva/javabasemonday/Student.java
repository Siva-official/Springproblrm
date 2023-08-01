package com.siva.javabasemonday;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("8096361976")
	long mobile;
	public Student() {
		System.out.println("student :constuctor");
	}
	public void info() {
		System.out.println("hello annotations working....");
		System.out.println(" siva mobile numbers is ="+mobile);
	}

}
