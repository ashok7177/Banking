package com.banking.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("application is started and pushed");
		SpringApplication.run(DemoApplication.class, args);
	}

}
