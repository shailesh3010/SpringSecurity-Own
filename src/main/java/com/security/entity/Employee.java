package com.security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_id;
	private String name;
	private String password;
	private String role;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", password=" + password + ", role=" + role + "]";
	}
	public Employee(int emp_id, String name, String password, String role) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.password = password;
		this.role = role;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
