package com.frozan.hlo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table
public class AdminHlo {


	private String adminFirstName;
	private String adminLastName;
	private String adminMiddleName;
	private String adminGender;
	private Date adminDateOfBirth;
	
	@Column(name="ADMINFIRSTNAME")
	public String getAdminFirstName() {
		return adminFirstName;
	}
	public void setAdminFirstName(String adminFirstName) {
		this.adminFirstName = adminFirstName;
	}
	@Column(name="ADMINLASTNAME")
	public String getAdminLastName() {
		return adminLastName;
	}
	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}
	@Column(name="ADMINMIDDLENAME")
	public String getAdminMiddleName() {
		return adminMiddleName;
	}
	public void setAdminMiddleName(String adminMiddleName) {
		this.adminMiddleName = adminMiddleName;
	}
	@Column(name="ADMINGENDER")
	public String getAdminGender() {
		return adminGender;
	}
	public void setAdminGender(String adminGender) {
		this.adminGender = adminGender;
	}
	@Column(name="ADMINDATOFBIRTH")
	public Date getAdminDateOfBirth() {
		return adminDateOfBirth;
	}
	public void setAdminDateOfBirth(Date adminDateOfBirth) {
		this.adminDateOfBirth = adminDateOfBirth;
	}
	

}
