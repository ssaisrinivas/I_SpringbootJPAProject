package com.sai.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sai.springboot.entity.Employee;
import com.sai.springboot.service.EmployeeService;

@Controller
public class HomeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/saveEmployee")
	public String insertEmployee(Model model) {
		
		Employee emp = new Employee();
		
		emp.setName("Mohan");
		emp.setDesignation("Acountant");
		emp.setDepartment("Accounts");
		emp.setExperiance(8);
		
		Employee empreturned = employeeService.saveEmployee(emp);
		
		String msg= empreturned.toString() + " Saved Successfully !!";
		model.addAttribute("employee",empreturned);
		model.addAttribute("message",msg);
		
		
		return "home";
	}

}
