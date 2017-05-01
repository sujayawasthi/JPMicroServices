package com.example.dto;

import java.io.Serializable;

public class OperatingStatement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7566909259640797764L;

	String type;

	String Year;

	public OperatingStatement() {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}

	public Long getId() {
		return id;
	}

	Long id;
}
