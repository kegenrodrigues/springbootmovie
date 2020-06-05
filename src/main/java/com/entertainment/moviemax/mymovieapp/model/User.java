package com.entertainment.moviemax.mymovieapp.model;

public class User {
	
	private String userId;
	private String username;
	private String password;
	private String emailId;
	private int phone;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public User() {
		
	}
	
	public User(String userId, String username, String password, String emailId, int phone) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.emailId = emailId;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", username=" + username + ", password=" + password + ", emailId="
				+ emailId + ", phone=" + phone + "]";
	}
}

