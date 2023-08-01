package com.siva.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("siva")
	private String Sname;
	@Value("121")
	private int srollno;
	@Autowired
	private Marks marks;
	@Autowired
	private School info;

	public Student() {
		System.out.println("hello object created.... dont worry i am working ");
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public int getSrollno() {
		return srollno;
	}

	public void setSrollno(int srollno) {
		this.srollno = srollno;
	}

	public Marks getMarks() {
		return marks;
	}

	public void setMarks(Marks marks) {
		this.marks = marks;
	}

	public School getInfo() {
		return info;
	}

	public void setInfo(School info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Student [" + Sname + ", " + srollno + ", " + marks + "," + info + "]";
	}

}
