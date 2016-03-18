package com.frozan.entity;

import java.util.Date;

public class Student {
	
	private String stdFirstName;
	private String stdLastName;
	private String stdMiddleName;
	private String stdGender;
	private Date stdDateOfBirth;
	
	public String getStdFirstName() {
		return stdFirstName;
	}
	public void setStdFirstName(String stdFirstName) {
		this.stdFirstName = stdFirstName;
	}
	public String getStdLastName() {
		return stdLastName;
	}
	public void setStdLastName(String stdLastName) {
		this.stdLastName = stdLastName;
	}
	public String getStdMiddleName() {
		return stdMiddleName;
	}
	public void setStdMiddleName(String stdMiddleName) {
		this.stdMiddleName = stdMiddleName;
	}
	public String getStdGender() {
		return stdGender;
	}
	public void setStdGender(String stdGender) {
		this.stdGender = stdGender;
	}
	public Date getStdDateOfBirth() {
		return stdDateOfBirth;
	}
	public void setStdDateOfBirth(Date stdDateOfBirth) {
		this.stdDateOfBirth = stdDateOfBirth;
	}
	
	
}
