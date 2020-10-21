package com.example.springdemo.service;

import java.util.List;

import com.example.springdemo.entity.Employee;

public interface EmployeeService {
	public List<Employee> getEmployee();
	public void saveEmployee(Employee theEmployee);
	public Employee getEmployee(int theId);
	public void deleteEmployee(int theId);
}
