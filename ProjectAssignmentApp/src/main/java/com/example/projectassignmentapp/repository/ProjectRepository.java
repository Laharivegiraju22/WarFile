package com.example.projectassignmentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projectassignmentapp.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

	Project findByProjectName(String projectName);

}
