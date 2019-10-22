package com.codeclan.EmployeeProject;

import com.codeclan.EmployeeProject.models.Department;
import com.codeclan.EmployeeProject.models.Employee;
import com.codeclan.EmployeeProject.repositories.DepartmentRespository;
import com.codeclan.EmployeeProject.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class EmployeeProjectApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRespository departmentRespository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("IT");
		departmentRespository.save(department);

		Employee employee1 = new Employee("Suzanne", "Dyson", 1, department);
		employeeRepository.save(employee1);
	}



}
