package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springdemo.dao.EmployeeDAO;
import com.example.springdemo.entity.Employee;
import com.example.springdemo.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		List<Employee> theEmployees = employeeService.getEmployee();
		theModel.addAttribute("employees",theEmployees);
		return "list-employees";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		Employee employee = new Employee();
		theModel.addAttribute("employee", employee);
		return "employee-form";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
		
		employeeService.saveEmployee(theEmployee);
		return "redirect:list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId,
									Model theModel) {
		System.out.println("in show form");
		Employee theEmployee = employeeService.getEmployee(theId);
		theModel.addAttribute("employee", theEmployee);
		return "employee-form";
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("employeeId") int theId,
									Model theModel) {
		employeeService.deleteEmployee(theId);
		return "redirect:list";
	}
}
