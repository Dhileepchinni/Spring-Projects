package com.example.project.salaries;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalaryController {
  
	 @GetMapping("/users/{userId}/salaries")
	 public Salary getDataById(@PathVariable int userId)
	 {
		//System.out.println("called salary porject");
		 return new Salary(1,"Programmer",26199,"successfull");
	 }
}
