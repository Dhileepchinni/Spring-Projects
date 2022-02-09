package com.example.project.secure;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController<Prinicpal> 
{
	//@Autowired UserRepository ur;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login.jsp";
	}
	@RequestMapping("/logout")
	public String logout()
	{
		return "logout.jsp";
	}
	@RequestMapping("user")
	
	public Principal user(Principal principal)
	{
		return principal;
	}
	
}
