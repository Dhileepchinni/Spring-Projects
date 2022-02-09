package com.example.project.info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;



@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@RestController
public class UserController {
    @Autowired 
    RestTemplate restTemplate;
	@Autowired
	UserService users;
	
	@GetMapping("/users")
	public Users getUserdetails() {
		
		return users.getPostByUser();
	}
	 
}
