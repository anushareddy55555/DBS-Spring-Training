package com.dbs.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dbs.entity.Department;
import com.dbs.entity.Employee;
import com.dbs.service.DepartmentService;
import com.dbs.service.EmployeeService;

@Controller
public class EmployeeController {
	
	EmployeeService employeeService;
	DepartmentService departmentService;
    public DepartmentService getDepartmentService() {
		return departmentService;
	}
    
    @Autowired
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	public EmployeeService getEmployeeService() {
		return employeeService;
	}
   @Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
   @RequestMapping("getAllEmps")
   public ModelAndView getAllEmps() { 
	   ModelAndView modelAndView=new ModelAndView("getAllEmps");
	   List<Employee> employees=employeeService.findAll();
	   modelAndView.addObject("emps",employees);
	   return modelAndView;
   }
   @RequestMapping("regemp")
	public ModelAndView newEmployee() {
	   System.out.println("Inside of regemp()");
		ModelAndView modelAndView=new ModelAndView("newEmployee","employee",new Employee());
		List<Department> departments=departmentService.findAll();
		modelAndView.addObject("departments",departments);
		return modelAndView;
	}
   @RequestMapping(value="saveemp",method = RequestMethod.POST)
   public ModelAndView newEmployee(@ModelAttribute Employee employee) {
	   System.out.println("Inside of saveemp :"+employee);
	   System.out.println("with department : "+employee.getDepartment());
	   ModelAndView modelAndView=new ModelAndView("redirect:getAllEmps");
	   employeeService.save(employee);
	  // modelAndView.addObject("savedEmp",employeeService.save(employee));
	   return modelAndView;
   }
}
