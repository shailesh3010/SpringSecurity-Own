package com.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.config.SecurityConfig;
import com.security.entity.Employee;
import com.security.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	public EmployeeRepository employeeRepository;
	
	@Autowired
	public SecurityConfig securityConfig;
	

	
	public String addEmployee(Employee emp) {
		emp.setPassword(securityConfig.passwordEncoder().encode(emp.getPassword()));
		employeeRepository.save(emp);
		return "user added to system";
	}


	public List<Employee> getEmployee() {
		
		return employeeRepository.findAll();
	}
	
//	public String addUSer(UserInfo userInfo) {
//	
//	userInfo.setPassword(securityConfig.passwordEncoder().encode(userInfo.getPassword()));
//	userInfoRepository.save(userInfo);
//	return "user added to system";
//}

	
//	public String addEmp(Employee emp) {
//		emp.setPassword(securityConfig.passwordEncoder().encode(emp.getPassword()));
//		employeeRepository.save(emp);
//		return "user added in the system";
//	}


}
