package com.siva.empexsetters;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Emp1 {
	private int eId;
	private String eName;
	private Address1 ad;
	private Experience1 ex;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Address1 getAd() {
		return ad;
	}

	public void setAd(Address1 ad) {
		this.ad = ad;
	}

	public Experience1 getEx() {
		return ex;
	}

	public void setEx(Experience1 ex) {
		this.ex = ex;
	}

}
