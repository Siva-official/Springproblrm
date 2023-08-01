package com.siva;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle{
	public void travle() {
		System.out.println("If you want travle here my Bus is available");
		
	}

	public void service() {
		System.out.println("www.busService.com...click here to get the details...");
		
	}


}
