package com.letsgo.LetsGoSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.letsgo.LetsGoSpringBoot.dao.EmployeeDAO;
import com.letsgo.LetsGoSpringBoot.model.Employee;

@Service
public class EmployeeServiceImpl implements EmplyeeService{

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Transactional
	@Override
	public List<Employee> get() {
		// TODO Auto-generated method stub
		return employeeDAO.get();
	}

	@Transactional
	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return employeeDAO.get(id);
	}
	@Transactional
	@Override
	public void save(Employee emp) {
		employeeDAO.save(emp);
		
	}
	@Transactional
	@Override
	public void delete(int id) {
		employeeDAO.delete(id);
		
	}

}
