package com.siva.empex;

public class Experience {
	private int year;
	private int month;
	
	public Experience(int year, int month) {
		super();
		this.year = year;
		this.month = month;
	}
	@Override
	public String toString() {
		return "Experience [year=" + year + ", month=" + month + "]";
	}
	

}
