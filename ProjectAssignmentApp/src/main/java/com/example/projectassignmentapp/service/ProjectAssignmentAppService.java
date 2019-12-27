package com.example.projectassignmentapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.projectassignmentapp.dto.ProjectDto;
import com.example.projectassignmentapp.dto.UserDto;
import com.example.projectassignmentapp.entity.Project;
import com.example.projectassignmentapp.entity.User;
import com.example.projectassignmentapp.exceptions.serviceexception.ProjectAssignmentAppServiceException;

@Service
public interface ProjectAssignmentAppService {

	String addUserDetails(String projectName, User user);

	String addProjectDetails(Project project);

	List<ProjectDto> getAllProjects();

	List<UserDto> getAllUsers();

	UserDto getUserById(int userId) throws ProjectAssignmentAppServiceException;

	String updateDetails(int userId, String password) throws ProjectAssignmentAppServiceException;

	List<UserDto> getTeam(int userId);

}
