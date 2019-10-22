package com.codeclan.EmployeeProject.repositories;

import com.codeclan.EmployeeProject.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
