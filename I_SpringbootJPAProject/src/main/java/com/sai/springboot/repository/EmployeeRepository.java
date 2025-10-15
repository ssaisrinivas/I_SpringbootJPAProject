package com.sai.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sai.springboot.entity.Employee;

// @Repository in advanced versions it is not needed

public interface EmployeeRepository extends JpaRepository<Employee , Long>{

}
