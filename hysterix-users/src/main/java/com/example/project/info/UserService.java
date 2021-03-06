package com.example.project.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class UserService {

	@Autowired 
    RestTemplate restTemplate;
	
	
	
	@HystrixCommand(fallbackMethod = "fallback")
	public Users getPostByUser()
	{
		//return new Salary(1,"Programmer",26199,"successfull");
		return restTemplate.getForObject("http://localhost:8081/users", Users.class);
	}
	
	@SuppressWarnings("unused")
	private Users fallback() {
		return new Users(0,"FallBack","Circuit Break. Post service is down","Fallback");
	}
}
