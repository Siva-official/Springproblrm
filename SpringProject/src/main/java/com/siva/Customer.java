package com.siva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
class Customer {
	@Autowired
	@Qualifier("car")
	Vehicle vehicle;
	public void info() {
		
		vehicle.service();
		System.out.println("*****************");
		vehicle.travle();
	}
	
	

}
