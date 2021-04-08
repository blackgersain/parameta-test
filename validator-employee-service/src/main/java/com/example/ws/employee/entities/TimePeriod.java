package com.example.ws.employee.entities;

import java.io.Serializable;

public class TimePeriod implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6972928596657168401L;

	private Integer years;
	private Integer months;
	private Integer days;

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}

	public Integer getMonths() {
		return months;
	}

	public void setMonths(Integer months) {
		this.months = months;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

}
