package com.example.projectassignmentapp.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int projectId;
	private String projectName;
	private String projectDescription;
	private String estimatedHours;
	@OneToMany(mappedBy = "project")
	private Set<User> users;

	public Project() {
		super();
	}

	public Project(int projectId, String projectName, String projectDescription, String estimatedHours,
			Set<User> users) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.estimatedHours = estimatedHours;
		this.users = users;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getEstimatedHours() {
		return estimatedHours;
	}

	public void setEstimatedHours(String estimatedHours) {
		this.estimatedHours = estimatedHours;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectDescription="
				+ projectDescription + ", estimatedHours=" + estimatedHours + ", users=" + users + "]";
	}

}
