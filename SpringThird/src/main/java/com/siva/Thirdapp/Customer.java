package com.siva.Thirdapp;

public class Customer {

//	Customer : firstName,lastName,email,mobile :: initilize the data using constructor
//	print the Customer details :: get the object & print the object 
	
	private String fName;
	private String lName;
	private String email;
	private  Long mobile;
	public Customer(String fName, String lName, String email, Long mobile) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Customer [fName=" + fName + ", lName=" + lName + ", email=" + email + ", mobile=" + mobile + "]";
	}

	
}
