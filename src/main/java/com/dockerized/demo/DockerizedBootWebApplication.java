package com.dockerized.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerizedBootWebApplication {

	public static void main(String[] args) {
		System.out.println("Hello from dockerized app");
		SpringApplication.run(DockerizedBootWebApplication.class, args);
		
	}

}
