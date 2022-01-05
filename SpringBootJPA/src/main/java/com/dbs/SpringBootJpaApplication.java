package com.dbs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dbs.entity.Department;
import com.dbs.entity.Employee;
import com.dbs.exception.InvalidDepartmentException;
import com.dbs.service.DepartmentService;
import com.dbs.service.EmployeeService;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt= SpringApplication.run(SpringBootJpaApplication.class, args);
		
		EmployeeService employeeService=ctxt.getBean(EmployeeService.class);
		DepartmentService departmentService=ctxt.getBean(DepartmentService.class);
		
		
		Department department1=new Department("Sales");
		Department department2=new Department("Production");
		
		Employee employee1=new Employee("Anu");
		Employee employee2=new Employee("Harsha");
		Employee employee3=new Employee("Varshitha");
		Employee employee4=new Employee("Pooja");
		
		List<Employee> empList1=new ArrayList<>();
		empList1.add(employee1);
		empList1.add(employee2);
		
		List<Employee> empList2=new ArrayList<>();
		empList2.add(employee3);
		empList2.add(employee4);
		
		department1.setEmployees(empList1);
		department2.setEmployees(empList2);
		
		employee1.setDepartment(department1);
		employee2.setDepartment(department1);
		
		employee3.setDepartment(department2);
		employee4.setDepartment(department2);
		
		departmentService.save(department1);
		departmentService.save(department2);
		
		employeeService.save(employee1);
		employeeService.save(employee2);
		employeeService.save(employee3);
		employeeService.save(employee4);
		
		try {
			Department department=departmentService.find(2);
			System.out.println(department);
			List<Employee> empsInDept1=employeeService.findAllByDeptId(2);
			for(Employee employee:empsInDept1) {
				System.out.println(employee);

				}
		} catch (InvalidDepartmentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}