package com.example.ws.employee.restCtrl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ws.employee.entities.Employee;
import com.example.ws.employee.service.IEmployeeService;

@RestController
public class EmployeeRestCtrl {

	@Autowired
	private IEmployeeService employeeService;
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> postEmployee(@Valid @RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.post(employee), HttpStatus.OK);
	}
}
