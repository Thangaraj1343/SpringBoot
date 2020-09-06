package com.letsgo.LetsGoSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.letsgo.LetsGoSpringBoot.model.Employee;
import com.letsgo.LetsGoSpringBoot.service.EmplyeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmplyeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employee> get()
	{
		return employeeService.get();
		
	}
	@PostMapping("employee")
	public Employee save(@RequestBody Employee emp)
	{
		employeeService.save(emp);
		return emp;
	}
	
	@GetMapping("/employee/{id}")
	public Employee get(@PathVariable int id)
	{
		return employeeService.get(id);
	}
	
	@DeleteMapping("/employee/{id}")
	public String delete(@PathVariable int id)
	{
		 employeeService.delete(id);
		 return "Employee has been deleted with emp id"+id;
	}
	
	@PutMapping("/employee")
	public Employee update(@RequestBody Employee emp)
	{
		employeeService.save(emp);
		return emp;
	}
}
