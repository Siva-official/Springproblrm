package com.siva.initdestroy;

public class MethodsEx {
	public MethodsEx() {
		System.out.println("object created dont worry ... i am working ");
		System.err.println("***********");

	}
	/*
	 * these lifecycle Methods are user defined in spring ......init and destroy
	 * 
	 * But in servlets these methods are predefined.....
	 */
	
	public void init() {

		System.out.println("init() method executed successfuly...");
		System.err.println("***********");

	}

	public void midMethod() {
		System.out.println("request processing successfuly done ...");
		System.out.println("hello if you want destroy then close the resourse");
		System.err.println("***********");

	}

	public void destroy() {
		System.out.println("destroy resourse closed successfuly...");
		System.out.println("you cant do any more  ...");
	}

}
