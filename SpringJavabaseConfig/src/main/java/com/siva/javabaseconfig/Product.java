package com.siva.javabaseconfig;

public class Product {
	
	int id;
	String pName;
	double price;
	public Product(int id, String pName, double price) {
		super();
		this.id = id;
		this.pName = pName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pName=" + pName + ", price=" + price + "]";
	}
	

}
