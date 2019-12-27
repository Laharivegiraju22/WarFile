package com.example.projectassignmentapp.service.serviceimpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.example.projectassignmentapp.dto.ProjectDto;
import com.example.projectassignmentapp.dto.UserDto;
import com.example.projectassignmentapp.entity.Project;
import com.example.projectassignmentapp.entity.User;
import com.example.projectassignmentapp.exceptions.serviceexception.NoSuchUserIdFoundException;
import com.example.projectassignmentapp.exceptions.serviceexception.ProjectAssignmentAppServiceException;
import com.example.projectassignmentapp.repository.ProjectRepository;
import com.example.projectassignmentapp.repository.UserRepository;
import com.example.projectassignmentapp.service.ProjectAssignmentAppService;

@Service
public class ProjectAssignmentAppServiceImpl implements ProjectAssignmentAppService {

	@Autowired
	ProjectRepository projectRepo;

	@Autowired
	UserRepository userRepo;

	@Autowired
	ModelMapper modelMapper;

	@Bean
	public ModelMapper ModelMapper() {
		return new ModelMapper();
	}

	private ProjectDto convertProjectEntityToDto(Project project) {
		return modelMapper.map(project, ProjectDto.class);

	}

	private Project convertProjectDtoToEntity(ProjectDto projectDto) {
		return modelMapper.map(projectDto, Project.class);
	}

	private UserDto convertUserEntityToDto(User user) {
		return modelMapper.map(user, UserDto.class);
	}

	private User convertUserDtoToEntity(UserDto userDto) {
		return modelMapper.map(userDto, User.class);
	}

	@Override
	public String addUserDetails(String projectName, User user) {
		Set<User> users = new HashSet<User>();
		users.add(user);
		Project project = projectRepo.findByProjectName(projectName);
		user.setProject(project);
		project.setUsers(users);
		userRepo.save(user);
		return "success";
	}

	@Override
	public String addProjectDetails(Project project) {
		projectRepo.save(project);
		return "success";
	}

	@Override
	public List<ProjectDto> getAllProjects() {
		List<ProjectDto> projectDtos = new ArrayList<ProjectDto>();
		projectDtos = projectRepo.findAll().stream().map(p -> convertProjectEntityToDto(p))
				.collect(Collectors.toList());

		return projectDtos;
	}

	@Override
	public List<UserDto> getAllUsers() {
		List<UserDto> userDtos = new ArrayList<UserDto>();
		userDtos = userRepo.findAll().stream().map(u -> convertUserEntityToDto(u)).collect(Collectors.toList());
		return userDtos;
	}

	@Override
	public UserDto getUserById(int userId) throws ProjectAssignmentAppServiceException {
		UserDto userDto = new UserDto();
		User user = userRepo.getOne(userId);
		if (user.getUserName().equalsIgnoreCase(null) || user.getUserName().equals("")) {
			throw new NoSuchUserIdFoundException("there is no such user with that id");
		}
		userDto = convertUserEntityToDto(user);
		return userDto;
	}

	@Override
	public String updateDetails(int userId, String password) throws ProjectAssignmentAppServiceException {
		UserDto userDto = new UserDto();
		User user = userRepo.getOne(userId);
		if (user.getUserName().equalsIgnoreCase(null) || user.getUserName().equals("")) {
			throw new NoSuchUserIdFoundException("there is no such user with that id");
		} else {
			user.setPassword(password);
			userRepo.saveAndFlush(user);
		}
		return "successful";
	}

	@Override
	public List<UserDto> getTeam(int userId) {

		return null;
	}
}
