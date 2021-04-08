package com.example.ws.employee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.example.ws.employee.persist.client.EmployeeSoapClient;

@Configuration
public class Config {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.example.ws.employee.persist.wsdl");
		return marshaller;
	}
	
	@Bean
	public EmployeeSoapClient employeeSoapClient(Jaxb2Marshaller marshaller) {
		EmployeeSoapClient client = new EmployeeSoapClient();
		client.setDefaultUri("http://localhost:8080/ws/employee");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
