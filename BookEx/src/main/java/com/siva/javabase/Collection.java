package com.siva.javabase;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;
@Component
public class Collection {
	
	List<Book> books;
	Set<Customer> cs;
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public Set<Customer> getCs() {
		return cs;
	}
	public void setCs(List<Customer> list) {
		this.cs =(Set<Customer>) list;
	}
	@Override
	public String toString() {
		return "Collection [books=" + books + ", cs=" + cs + "]";
	}




	

}
