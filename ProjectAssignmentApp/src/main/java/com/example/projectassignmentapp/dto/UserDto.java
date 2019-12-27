package com.example.projectassignmentapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class UserDto {
	private int userId;
	private String userName;
	private String password;
	private String dateOfJoining;
	private String email;
	private String role;
	@JsonIgnoreProperties("userDto")
	private ProjectDto projectDto;

	public UserDto() {
		super();
	}

	public UserDto(int userId, String userName, String password, String dateOfJoining, String email, String role,
			ProjectDto projectDto) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.dateOfJoining = dateOfJoining;
		this.email = email;
		this.role = role;
		this.projectDto = projectDto;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public ProjectDto getProjectDto() {
		return projectDto;
	}

	public void setProjectDto(ProjectDto projectDto) {
		this.projectDto = projectDto;
	}

	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userName=" + userName + ", password=" + password + ", dateOfJoining="
				+ dateOfJoining + ", email=" + email + ", role=" + role + ", projectDto=" + projectDto + "]";
	}

}
