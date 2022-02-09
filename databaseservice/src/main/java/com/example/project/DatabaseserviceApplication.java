package com.example.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DatabaseserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseserviceApplication.class, args);
	}

}
