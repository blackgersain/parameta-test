package com.example.ws.employee.persist.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.example.ws.employee.persist.wsdl.PostEmployeeRequest;
import com.example.ws.employee.persist.wsdl.PostEmployeeResponse;

public class EmployeeSoapClient extends WebServiceGatewaySupport {

	public PostEmployeeResponse postEmployee(PostEmployeeRequest request) {
		PostEmployeeResponse response = (PostEmployeeResponse) getWebServiceTemplate()
				.marshalSendAndReceive("http://localhost:8080/ws/employee"
						, request
						, new SoapActionCallback("http://www.example.org/employee/postEmployeeRequest"));
		return response;
	}
}
