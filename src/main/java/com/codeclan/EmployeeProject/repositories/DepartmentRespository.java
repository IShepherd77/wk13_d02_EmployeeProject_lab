package com.codeclan.EmployeeProject.repositories;

import com.codeclan.EmployeeProject.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRespository extends JpaRepository<Department, Long> {
}
