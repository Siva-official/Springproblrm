package com.siva.empexsetters;

import org.springframework.context.annotation.Bean;

public class Config {
	@Bean
	public Address1 address() {

		Address1 address = new Address1();
		address.setCity("hyd");
		address.setCountry("india");

		return address;

	}

	@Bean
	public Experience1 ex() {
		Experience1 experience = new Experience1();
		experience.setMonth(2);
		experience.setYear(5);
		return experience;
	}

	@Bean
	public Emp1 emp() {
		Emp1 emp1 = new Emp1();
		emp1.seteId(121);
		emp1.seteName("siva");
		emp1.setAd(address());
		emp1.setEx(ex());
		return emp1;
	}

}
