package com.example.project.details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@RestController
public class UserController {
    @Autowired 
    RestTemplate restTemplate;
	
	
	@GetMapping("/users/{userId}")
	public Users getPostByUser(@PathVariable int userId)
	{
		//return new Salary(1,"Programmer",26199,"successfull");
		return restTemplate.getForObject("http://data-base-info/users/1", Users.class);
	}
	 
}
