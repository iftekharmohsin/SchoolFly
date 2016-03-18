package com.frozan.hlo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class StudentHlo {
	

	private String StdFirstName;
	private String StdLastName;
	private String StdMiddleName;
	private Date StdDateOfBirth;
	private String StdGender;
	
	@Column(name="STUDENTFIRSTNAME")
	public String getStdFirstName() {
		return StdFirstName;
	}
	public void setStdFirstName(String stdFirstName) {
		StdFirstName = stdFirstName;
	}
	
	@Column(name="STUDENTLASTNAME")
	public String getStdLastName() {
		return StdLastName;
	}
	public void setStdLastName(String stdLastName) {
		StdLastName = stdLastName;
	}
	@Column(name="STUDENTMIDDLENAME")
	public String getStdMiddleName() {
		return StdMiddleName;
	}
	public void setStdMiddleName(String stdMiddleName) {
		StdMiddleName = stdMiddleName;
	}
	@Column(name="STUDENTGENDER")
	public String getStdGender() {
		return StdGender;
	}
	public void setStdGender(String stdGender) {
		StdGender = stdGender;
	}
	@Column(name="STUDENTDATEOFBIRTH")
	public Date getStdDateOfBirth() {
		return StdDateOfBirth;
	}
	public void setStdDateOfBirth(Date stdDateOfBirth) {
		StdDateOfBirth = stdDateOfBirth;
	}
	
	
	
}
