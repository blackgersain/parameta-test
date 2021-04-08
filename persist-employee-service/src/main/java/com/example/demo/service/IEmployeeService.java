package com.example.demo.service;

import org.example.employee.PostEmployeeRequest;
import org.example.employee.PostEmployeeResponse;

import com.example.demo.entity.Employee;

public interface IEmployeeService {

	public Employee save(Employee employee);
	
	public PostEmployeeResponse save(PostEmployeeRequest request);
}
