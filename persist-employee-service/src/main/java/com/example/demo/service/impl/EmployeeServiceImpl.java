package com.example.demo.service.impl;

import org.example.employee.EmployeeJaxb;
import org.example.employee.PostEmployeeRequest;
import org.example.employee.PostEmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.repository.EmployeeRepo;
import com.example.demo.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Override
	public Employee save(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	@Override
	public PostEmployeeResponse save(PostEmployeeRequest request) {
		Employee employee = employeeMapper.employeeJaxbToEmployee(request.getEmployeeJaxb());
		
		save(employee);
		
		EmployeeJaxb employeJaxb = employeeMapper.employeeToEmployeeJaxb(employee);
		PostEmployeeResponse response = new PostEmployeeResponse();
		response.setEmployeeJaxb(employeJaxb);
		return response;
	}
	
}
