package com.example.projectassignmentapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	private String password;
	private String dateOfJoining;
	private String email;
	private String role;
	@ManyToOne
	private Project project;

	public User() {
		super();
	}

	public User(int userId, String userName, String password, String dateOfJoining, String email, String role,
			Project project) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.dateOfJoining = dateOfJoining;
		this.email = email;
		this.role = role;
		this.project = project;
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

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", dateOfJoining="
				+ dateOfJoining + ", email=" + email + ", role=" + role + ", project=" + project + "]";
	}

}
