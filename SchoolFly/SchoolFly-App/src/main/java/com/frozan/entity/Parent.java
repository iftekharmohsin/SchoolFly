package com.frozan.entity;

import java.util.Date;

public class Parent {

	private String prntFirstName;
	private String prntLastName;
	private String PrntMiddleName;
	private String PrntGender;
	private Date prntDateOfBirth;
	
	
	public String getPrntFirstName() {
		return prntFirstName;
	}
	public void setPrntFirstName(String prntFirstName) {
		this.prntFirstName = prntFirstName;
	}
	public String getPrntLastName() {
		return prntLastName;
	}
	public void setPrntLastName(String prntLastName) {
		this.prntLastName = prntLastName;
	}
	public String getPrntMiddleName() {
		return PrntMiddleName;
	}
	public void setPrntMiddleName(String prntMiddleName) {
		PrntMiddleName = prntMiddleName;
	}
	public String getPrntGender() {
		return PrntGender;
	}
	public void setPrntGender(String prntGender) {
		PrntGender = prntGender;
	}
	public Date getPrntDateOfBirth() {
		return prntDateOfBirth;
	}
	public void setPrntDateOfBirth(Date prntDateOfBirth) {
		this.prntDateOfBirth = prntDateOfBirth;
	}
	
	
}
