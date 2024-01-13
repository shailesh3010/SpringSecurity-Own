package com.security.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.security.entity.Employee;
import com.security.repository.EmployeeRepository;

public class EmployeeUserDetailsService implements UserDetailsService {
	
	@Autowired
	public EmployeeRepository empRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Employee> emp=empRepository.findByName(username);
		return emp.map(EmployeeUserDetails::new).orElseThrow(()-> new UsernameNotFoundException("user not found"));
	}

}
