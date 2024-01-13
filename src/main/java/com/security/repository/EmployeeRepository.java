package com.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Optional<Employee> findByName(String empName);

}
