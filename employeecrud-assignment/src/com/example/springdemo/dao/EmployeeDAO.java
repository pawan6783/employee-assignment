package com.example.springdemo.dao;

import java.util.List;

import com.example.springdemo.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> getEmployee();
	public void saveEmployee(Employee theEmployee);
	public Employee getEmployee(int theId);
	public void deleteEmployee(int theId);
}
