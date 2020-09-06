package com.letsgo.LetsGoSpringBoot.service;

import java.util.List;

import com.letsgo.LetsGoSpringBoot.model.Employee;

public interface EmplyeeService {

List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee emp);
	
	void delete(int id);
}
