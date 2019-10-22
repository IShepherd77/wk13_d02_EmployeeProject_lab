package com.codeclan.EmployeeProject.controllers;

import com.codeclan.EmployeeProject.models.Department;
import com.codeclan.EmployeeProject.repositories.DepartmentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    DepartmentRespository departmentRespository;

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentRespository.findAll();
    }
}
