package com.example.project.salaries;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Users {
 
	 private int userId;
	 private String username;
	 private String email;
	 private int experience;
	
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", username=" + username + ", email=" + email + ", experience=" + experience
				+ "]";
	}

	public Users(int userId, String username, String email, int experience) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.experience = experience;
	}
	 
	 
}
