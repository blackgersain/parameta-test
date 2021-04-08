package com.example.demo.endpoint;

import org.example.employee.PostEmployeeRequest;
import org.example.employee.PostEmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.demo.service.IEmployeeService;

@Endpoint
public class EmployeeEndPoint {

	public static final String NAMESPACE_URI = "http://www.example.org/employee";
	
	@Autowired
	private IEmployeeService employeeSvc;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "postEmployeeRequest")
	@ResponsePayload
	public PostEmployeeResponse postEmployee(@RequestPayload PostEmployeeRequest request) {
		return employeeSvc.save(request);
	}
}
