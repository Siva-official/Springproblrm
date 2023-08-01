package com.siva;

import org.springframework.stereotype.Component;

@Component
public class Car  implements Vehicle{

	public void travle() {
		System.out.println("If you want travle here my car is available");
		
	}

	public void service() {
		System.out.println("www.carService.com...click here to get the details...");
		
	}

}
