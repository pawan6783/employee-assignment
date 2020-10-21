package com.example.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.dao.EmployeeDAO;
import com.example.springdemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	@Transactional
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployee();
	}

	@Override
	@Transactional
	public void saveEmployee(Employee theEmployee) {
		// TODO Auto-generated method stub
		employeeDAO.saveEmployee(theEmployee);
	}

	@Override
	@Transactional
	public Employee getEmployee(int theId) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployee(theId);
	}

	@Override
	@Transactional
	public void deleteEmployee(int theId) {
		// TODO Auto-generated method stub
		employeeDAO.deleteEmployee(theId);
	}

}
