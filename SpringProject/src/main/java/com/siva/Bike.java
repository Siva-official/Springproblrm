package com.siva;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public void travle() {
		System.out.println("If you want travle here my Bike  is available");
		
	}

	public void service() {
		System.out.println("www.bikeService.com...click here to get the details...");
		
	}


}
