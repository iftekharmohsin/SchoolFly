package com.frozan.hlo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class ParentHlo {

	private String prntFirstName;
	private String prntLastName;
	private String PrntMiddleName;
	private String PrntGender;
	private Date prntDateOfBirth;
	
	@Column(name="PARENTFIRSTNAME")
	public String getPrntFirstName() {
		return prntFirstName;
	}
	public void setPrntFirstName(String prntFirstName) {
		this.prntFirstName = prntFirstName;
	}
	@Column(name="PARENTMIDDLENAME")
	public String getPrntLastName() {
		return prntLastName;
	}
	public void setPrntLastName(String prntLastName) {
		this.prntLastName = prntLastName;
	}
	@Column(name="PARENTLASTNAME")
	public String getPrntMiddleName() {
		return PrntMiddleName;
	}
	public void setPrntMiddleName(String prntMiddleName) {
		PrntMiddleName = prntMiddleName;
	}
	@Column(name="PARENTGENDER")
	public String getPrntGender() {
		return PrntGender;
	}
	public void setPrntGender(String prntGender) {
		PrntGender = prntGender;
	}
	@Column(name="PARENTDATEOFBIRTH")
	public Date getPrntDateOfBirth() {
		return prntDateOfBirth;
	}
	public void setPrntDateOfBirth(Date prntDateOfBirth) {
		this.prntDateOfBirth = prntDateOfBirth;
	}
	
	
	
}
