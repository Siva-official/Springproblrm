package com.siva.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Properties {
	@Value("${ip}")
	String ip;
	@Value("${user_name}")
	String username;
	@Value("${password}")
	String password;
	@Value("${port}")
	int port;
	@Override
	public String toString() {
		return "Properties [ip=" + ip + ", username=" + username + ", password=" + password + ", port=" + port + "]";
	}
	
	

	

}
