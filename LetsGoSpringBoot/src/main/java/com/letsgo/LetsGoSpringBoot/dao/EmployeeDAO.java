package com.letsgo.LetsGoSpringBoot.dao;

import java.util.List;

import com.letsgo.LetsGoSpringBoot.model.Employee;

public interface EmployeeDAO {

	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee emp);
	
	void delete(int id);
}
