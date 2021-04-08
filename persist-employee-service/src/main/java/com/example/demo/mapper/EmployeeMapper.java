package com.example.demo.mapper;

import org.example.employee.EmployeeJaxb;
import org.mapstruct.Mapper;

import com.example.demo.entity.Employee;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
	
	EmployeeJaxb employeeToEmployeeJaxb(Employee employee);
	
	Employee employeeJaxbToEmployee(EmployeeJaxb employeeJaxb);
}
