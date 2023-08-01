package com.siva.empex;

public class Emp {
	
	private int eId;
	private String eName;
	private Address ad;
	private Experience ex;
	
	public Emp(int eId, String eName, Address ad, Experience ex) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.ad = ad;
		this.ex = ex;
	}
	@Override
	public String toString() {
		return "Emp [eId=" + eId + ", eName=" + eName + ", ad=" + ad + ", ex=" + ex + "]";
	}
	

}
