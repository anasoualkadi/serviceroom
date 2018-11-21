package com.formation.serviceroom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ServiceRoomApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		
		SpringApplication.run(ServiceRoomApplication.class, args);
	}
}
