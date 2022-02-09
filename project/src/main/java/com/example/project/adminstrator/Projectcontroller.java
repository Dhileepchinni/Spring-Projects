package com.example.project.adminstrator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Projectcontroller {

  @Autowired
   Projectservice ps;
  @PostMapping("/insert")
	public String push(@RequestBody Project p)
	{
		return ps.push(p);
	}
}
