package com.example.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OperatingStatement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8731547266644172725L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String year;
	private String type;

	public String getYear() {
		return year;
	}

	public OperatingStatement(String year, String type) {
		super();
		this.year = year;
		this.type = type;
	}

	public OperatingStatement() {

	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getId() {
		return id;
	}
}
