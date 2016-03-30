package com.frozan.entity;

import java.util.Date;

public class Teacher {
	
	private String tchrFirstName;
	private String tchrLastName;
	private String tchrMiddleName;
	private String tchrGender;
	private Date tchrDateOfBirth;
	
	public String getTchrFirstName() {
		return tchrFirstName;
	}
	public void setTchrFirstName(String tchrFirstName) {
		this.tchrFirstName = tchrFirstName;
	}
	public String getTchrLastName() {
		return tchrLastName;
	}
	public void setTchrLastName(String tchrLastName) {
		this.tchrLastName = tchrLastName;
	}
	public String getTchrMiddleName() {
		return tchrMiddleName;
	}
	public void setTchrMiddleName(String tchrMiddleName) {
		this.tchrMiddleName = tchrMiddleName;
	}
	public String getTchrGender() {
		return tchrGender;
	}
	public void setTchrGender(String tchrGender) {
		this.tchrGender = tchrGender;
	}
	public Date getTchrDateOfBirth() {
		return tchrDateOfBirth;
	}
	public void setTchrDateOfBirth(Date tchrDateOfBirth) {
		this.tchrDateOfBirth = tchrDateOfBirth;
	}

	
}
