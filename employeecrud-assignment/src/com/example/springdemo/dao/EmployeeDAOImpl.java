package com.example.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springdemo.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Employee getEmployee(int theId) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Employee theEmployee = currentSession.get(Employee.class,theId);
		return theEmployee;
	}
	
	@Override
	public void saveEmployee(Employee theEmployee) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theEmployee);
	}
	@Override
	public void deleteEmployee(int theId) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId", theId);
		theQuery.executeUpdate();
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Employee> theQuery = currentSession.createQuery("from Employee order by lastName",Employee.class);
		List<Employee> employees = theQuery.getResultList();
		return employees;
	}

	
}
