package com.sai.springboot.service;

import java.util.List;
import java.util.Optional;

import com.sai.springboot.entity.Employee;

public interface EmployeeService  {

	public Employee saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public Employee findById(long id);
	public List<Employee> findAll();
}
