package com.siva.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class School {
	@Value("praksam")
	private String name;
	@Value("470")
	private int id;
	@Value("koyyalagudem")
	private String location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "School Information [Schoolname=" + name + ", Schoolid=" + id + ", Schoollocation=" + location + "]";
	}

}
