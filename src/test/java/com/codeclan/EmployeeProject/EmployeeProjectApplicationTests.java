package com.codeclan.EmployeeProject;

import com.codeclan.EmployeeProject.models.Department;
import com.codeclan.EmployeeProject.models.Employee;
import com.codeclan.EmployeeProject.models.Project;
import com.codeclan.EmployeeProject.repositories.DepartmentRespository;
import com.codeclan.EmployeeProject.repositories.EmployeeRepository;
import com.codeclan.EmployeeProject.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class EmployeeProjectApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRespository departmentRespository;

	@Autowired
	ProjectRepository projectRepository;

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

	@Test
	public void addEmployeesAndProjects() {
		Department department = new Department("IT");
		departmentRespository.save(department);

		Employee employee1 = new Employee("Sally", "Smith", 2, department);
		employeeRepository.save(employee1);

		Project project1 = new Project("Exodus", 300);
		projectRepository.save(project1);

		project1.addEmployee(employee1);
		projectRepository.save(project1);

	}

}
