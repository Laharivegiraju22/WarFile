package com.example.projectassignmentapp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.example.projectassignmentapp.exceptions.serviceexception.ProjectAssignmentAppServiceException;

@ControllerAdvice
public class ProjectAssignmentExceptionHandler {

	@ExceptionHandler(ProjectAssignmentAppServiceException.class)
	public ModelAndView NoSuchUserIdFoundException(Exception e, Throwable t, Model model) {
		model.addAttribute("errormessage", e.getLocalizedMessage());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("error");
		return modelAndView;
	}

}
