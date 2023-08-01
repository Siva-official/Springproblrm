package com.siva.secondapp;

public class Operation {

	private int num1;
	private int num2;
	public Operation(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public void add() {
		System.out.println("addition of two numbers ..."+(num1+num2));
		
	}
	public void mul() {
		System.out.println("addition of two numbers ..."+(num1*num2));
		
	}
	
}
