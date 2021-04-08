package com.example.ws.employee.mapper;

import org.mapstruct.Mapper;

import com.example.ws.employee.entities.Employee;
import com.example.ws.employee.persist.wsdl.EmployeeJaxb;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
	
	EmployeeJaxb employeeToEmployeeJaxb(Employee employee);
	
	Employee employeeJaxbToEmployee(EmployeeJaxb employeeJaxb);
}
