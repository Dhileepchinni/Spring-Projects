package com.example.project.data;


public class Users {

	private int userId;
	private String userName;
	private String email;
	private String experience;
	public Users(int userId, String userName, String email, String experience) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.experience = experience;
	}
	public Users() {
		super();
		
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", email=" + email + ", experience=" + experience
				+ "]";
	}
	
	
	
}
