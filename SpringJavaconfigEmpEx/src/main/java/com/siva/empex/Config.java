package com.siva.empex;

import org.springframework.context.annotation.Bean;

public class Config {
	
	@Bean
	public Address address() {
		
		Address address=new Address("hyd","india");
		return address;	
	}
	@Bean
	public Experience experience() {
		Experience   experience=new Experience(1,12);
		return experience;
	}
@Bean 
public Emp emp() {
	Emp emp=new Emp(121,"siva",address(),experience());
	return emp;
}





}
