package com.examplẹ.project.details;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalaryController {

	@GetMapping("/users/{userId}/salaries")
	public Users getPostByUser(@PathVariable int userId)
	{
		 return new Users(1,"Full stack Developer","dchinni@cognizant.com","successfull");
	}
}
