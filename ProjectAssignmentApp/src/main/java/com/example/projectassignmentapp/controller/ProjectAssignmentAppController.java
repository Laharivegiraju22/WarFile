package com.example.projectassignmentapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.projectassignmentapp.entity.Project;
import com.example.projectassignmentapp.entity.User;
import com.example.projectassignmentapp.exceptions.serviceexception.ProjectAssignmentAppServiceException;
import com.example.projectassignmentapp.service.ProjectAssignmentAppService;

@Controller
public class ProjectAssignmentAppController {

	@Autowired
	ProjectAssignmentAppService projectAppServiceImpl;

	@RequestMapping("/")
	public String hello() {
		return "index";
	}

	@RequestMapping("/admin")
	public String asAdmin() {
		return "admin";
	}

	@RequestMapping("/user")
	public String asUser() {
		return "user";
	}

	@RequestMapping("/addUser")
	public String addUser() {
		return "addUser";
	}

	@RequestMapping("/addUserDetails")
	public String addUserDetails(@RequestParam String projectName, User user) {
		projectAppServiceImpl.addUserDetails(projectName, user);
		return "admin";
	}

	@RequestMapping("/addProject")
	public String addProject(Project project) {
		return "addProject";
	}

	@RequestMapping("/addProjectDetails")
	public String addProjectDetails(Project project) {
		projectAppServiceImpl.addProjectDetails(project);
		return "admin";
	}

	@RequestMapping("/getAllProjects")
	public String getAllProjects(Model model) {
		model.addAttribute("projects", projectAppServiceImpl.getAllProjects());
		return "viewProjects";
	}

	@RequestMapping("/getAllUsers")
	public String getAllUsers(Model model) {
		model.addAttribute("users", projectAppServiceImpl.getAllUsers());
		return "viewUsers";
	}

	@RequestMapping("/showUserById")
	public String showUserById() {
		return "viewByUserId";
	}

	@RequestMapping("/getUserById")
	public ModelAndView getUserById(@RequestParam int userId, Model model) throws ProjectAssignmentAppServiceException {
		model.addAttribute("user", projectAppServiceImpl.getUserById(userId));
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("viewByUserId");
		return modelAndView;
	}

	@RequestMapping("/updatePassword")
	public String updatePassword1() {
		return "updatePassword";
	}

	@RequestMapping("/changePassword")
	public ModelAndView changePassword(@RequestParam int userId, String password, Model model)
			throws ProjectAssignmentAppServiceException {
		projectAppServiceImpl.updateDetails(userId, password);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("changePassword");
		return modelAndView;
	}

	@RequestMapping("/viewUsersByProId")
	public ModelAndView viewTeam(@RequestParam int userId, Model model) {
		model.addAttribute("users", projectAppServiceImpl.getTeam(userId));
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("viewTeam");
		return modelAndView;
	}
}
