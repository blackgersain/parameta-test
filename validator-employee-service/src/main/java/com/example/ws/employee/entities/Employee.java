package com.example.ws.employee.entities;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4644275354942487294L;

	@NotBlank(message = "name must contain at least one character")
	private String name;
	
	@NotBlank(message = "surname must contain at least one character")
	private String surname;
	
	@NotBlank(message = "documentType must contain at least one character")
	private String documentType;
	
	@NotBlank(message = "documentNumber must contain at least one character")
	private String documentNumber;
	
	@NotNull(message = "birthdate must not be null")
	private Date birthdate;
	
	@NotNull(message = "bondingDate must not be null")
	private Date bondingDate;
	
	@NotBlank(message = "charge must contain at least one character")
	private String charge;

	@NotNull(message = "salary must not be null")
	private Double salary;

	private TimePeriod bondingTime;
	
	private TimePeriod age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Date getBondingDate() {
		return bondingDate;
	}

	public void setBondingDate(Date bondingDate) {
		this.bondingDate = bondingDate;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public TimePeriod getBondingTime() {
		return bondingTime;
	}

	public void setBondingTime(TimePeriod bondingTime) {
		this.bondingTime = bondingTime;
	}

	public TimePeriod getAge() {
		return age;
	}

	public void setAge(TimePeriod age) {
		this.age = age;
	}
}
