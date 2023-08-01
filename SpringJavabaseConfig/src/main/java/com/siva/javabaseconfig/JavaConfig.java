package com.siva.javabaseconfig;

import java.security.PublicKey;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean // by default method name is refernce....
	public Food food() {
		return new Food();
	}

	@Bean(name = { "d1", "d2", "d3" }) // multiple references....
	public Drinks drinks() {
		return new Drinks();
	}

	@Bean
	public Product product() {
		return new Product(112, "i Phone", 900000);
	}

@Bean
public Customer customer() {
	Customer customer=new Customer();
	customer.setId(12);
	customer.setName("siva");
	customer.setMobile(9090898978L);
	return customer;
}

}
