package com.siva.javabasemonday;

import org.springframework.stereotype.Component;

@Component

public class Emp {
	public Emp() {
		System.out.println("***********");
		System.out.println("emp:constuctor");
	}

	public void info() {

		System.out.println("employees are good ...");

	}

}
