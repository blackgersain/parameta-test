package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4644275354942487294L;

	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "document_type")
	private String documentType;
	
	@Id
	@Column(name = "document_number")
	private String documentNumber;
	
	//TODO: validate date minor to current date
	@Temporal(value = TemporalType.DATE)
	private Date birthdate;
	
	//TODO: validate date minor to current date
	@Temporal(value = TemporalType.DATE)
	private Date bondingDate;
	
	@Column(name = "charge")
	private String charge;
	
	@Column(name = "salary")
	private Double salary;

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
}
