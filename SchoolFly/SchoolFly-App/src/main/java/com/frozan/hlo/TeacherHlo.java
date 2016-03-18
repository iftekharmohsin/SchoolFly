package com.frozan.hlo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class TeacherHlo {

	private String tchrFirstName;
	private String tchrLastName;
	private String tchrMiddleName;
	private String tchrGender;
	private Date tchrDateOfBirth;
	
	@Column(name="TEAHCERFIRSTNAME")
	public String getTchrFirstName() {
		return tchrFirstName;
	}
	public void setTchrFirstName(String tchrFirstName) {
		this.tchrFirstName = tchrFirstName;
	}
	@Column(name="TEAHCERLASTNAME")
	public String getTchrLastName() {
		return tchrLastName;
	}
	public void setTchrLastName(String tchrLastName) {
		this.tchrLastName = tchrLastName;
	}
	@Column(name="TEAHCERMIDDLENAME")
	public String getTchrMiddleName() {
		return tchrMiddleName;
	}
	public void setTchrMiddleName(String tchrMiddleName) {
		this.tchrMiddleName = tchrMiddleName;
	}
	@Column(name="TEAHCERGENDER")
	public String getTchrGender() {
		return tchrGender;
	}
	public void setTchrGender(String tchrGender) {
		this.tchrGender = tchrGender;
	}
	@Column(name="TEAHCERDATEOFBIRTH")
	public Date getTchrDateOfBirth() {
		return tchrDateOfBirth;
	}
	public void setTchrDateOfBirth(Date tchrDateOfBirth) {
		this.tchrDateOfBirth = tchrDateOfBirth;
	}

}
