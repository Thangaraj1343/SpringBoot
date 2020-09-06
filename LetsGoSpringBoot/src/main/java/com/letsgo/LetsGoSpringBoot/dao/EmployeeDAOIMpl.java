package com.letsgo.LetsGoSpringBoot.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.letsgo.LetsGoSpringBoot.model.Employee;

@Repository
public class EmployeeDAOIMpl implements EmployeeDAO{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Employee> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> query = currentSession.createQuery("from Employee",Employee.class); 
		List<Employee> list = query.getResultList();
		return list;
	}

	@Override
	public Employee get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(Employee.class, id);
	}

	@Override
	public void save(Employee emp) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(emp);
	}

	@Override
	public void delete(int id) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.delete(currentSession.get(Employee.class, id));
		
	}

}
