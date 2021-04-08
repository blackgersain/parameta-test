package com.example.ws.employee.service.impl;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ws.employee.entities.Employee;
import com.example.ws.employee.entities.TimePeriod;
import com.example.ws.employee.mapper.EmployeeMapper;
import com.example.ws.employee.persist.client.EmployeeSoapClient;
import com.example.ws.employee.persist.wsdl.EmployeeJaxb;
import com.example.ws.employee.persist.wsdl.PostEmployeeRequest;
import com.example.ws.employee.persist.wsdl.PostEmployeeResponse;
import com.example.ws.employee.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Autowired
	EmployeeSoapClient employeeSoapClient;
	
	@Override
	public Employee post(Employee employee) {
		EmployeeJaxb employeeJaxb = employeeMapper.employeeToEmployeeJaxb(employee);
		PostEmployeeRequest request = new PostEmployeeRequest();
		request.setEmployeeJaxb(employeeJaxb);
		
		PostEmployeeResponse response =  employeeSoapClient.postEmployee(request);
		employee = employeeMapper.employeeJaxbToEmployee(response.getEmployeeJaxb());
		employee.setBondingTime(getTimePeriod(employee.getBondingDate()));
		employee.setAge(getTimePeriod(employee.getBirthdate()));
		return employee;
	}
	
	private TimePeriod getTimePeriod(Date date) {
		Period period = currentDateMinus(date);
		TimePeriod timePeriod = new TimePeriod();
		timePeriod.setYears(period.getYears());
		timePeriod.setMonths(period.getMonths());
		timePeriod.setDays(period.getDays());
		return timePeriod;
	}
	
	private Period currentDateMinus(Date date) {
		LocalDate startDate = date.toInstant()
				.atZone(ZoneId.systemDefault())
				.toLocalDate();
		LocalDate endDate = (new Date()).toInstant()
				.atZone(ZoneId.systemDefault())
				.toLocalDate();
		return Period.between(startDate, endDate);
	}
}
