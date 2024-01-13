package com.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.entity.Employee;
import com.security.service.EmployeeService;
import com.security.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	public EmployeeService employeeService;
	
	
	@GetMapping("/normal")
	public ResponseEntity<String> normalUser() {
		return ResponseEntity.ok( "Hello, I am Normal user");
	}
	

	
	@GetMapping("/admin")
	public ResponseEntity<String> adminUser() {
		return ResponseEntity.ok( "Hello, I am Admin user");
	}
	
	@PostMapping("/new")
	public String addEmployee(@RequestBody Employee emp) {
		
		return employeeService.addEmployee(emp);
	}
	
	@GetMapping("/all")
	public List<Employee> getEmployee(){
		return employeeService.getEmployee();
	}
	
	@GetMapping("/public")
	public ResponseEntity<String> publicUser() {
		return ResponseEntity.ok( "Hello, welcome to employee data");
	}

}
