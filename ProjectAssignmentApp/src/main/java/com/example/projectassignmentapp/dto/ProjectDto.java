package com.example.projectassignmentapp.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class ProjectDto {
	private int projectId;
	private String projectName;
	private String projectDescription;
	private String estimatedHours;
	@JsonIgnoreProperties("projectDto")
	private Set<UserDto> userDtos;

	public ProjectDto() {
		super();
	}

	public ProjectDto(int projectId, String projectName, String projectDescription, String estimatedHours,
			Set<UserDto> userDtos) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.estimatedHours = estimatedHours;
		this.userDtos = userDtos;
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

	public Set<UserDto> getUsers() {
		return userDtos;
	}

	public void setUsers(Set<UserDto> userDtos) {
		this.userDtos = userDtos;
	}

	@Override
	public String toString() {
		return "ProjectDto [projectId=" + projectId + ", projectName=" + projectName + ", projectDescription="
				+ projectDescription + ", estimatedHours=" + estimatedHours + ", userDtos=" + userDtos + "]";
	}

}
