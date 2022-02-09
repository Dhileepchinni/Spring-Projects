package com.example.project.data;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
public class DatabaseInfo {

	@GetMapping("/users/{userId}")
	public Users getPostByUser(@PathVariable int userId)
	{
		//return new Salary(1,"Programmer",26199,"successfull");
		 return new Users(1,"Programmer","cognizant@cog.mail","successfull");
	}
}
