package com.frozan.entity;

import java.util.Date;

public class Admin {

	private String adminFirstName;
	private String adminLastName;
	private String adminMiddleName;
	private String adminGender;
	private Date adminDateOfBirth;
	public String getAdminFirstName() {
		return adminFirstName;
	}
	public void setAdminFirstName(String adminFirstName) {
		this.adminFirstName = adminFirstName;
	}
	public String getAdminLastName() {
		return adminLastName;
	}
	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}
	public String getAdminMiddleName() {
		return adminMiddleName;
	}
	public void setAdminMiddleName(String adminMiddleName) {
		this.adminMiddleName = adminMiddleName;
	}
	public String getAdminGender() {
		return adminGender;
	}
	public void setAdminGender(String adminGender) {
		this.adminGender = adminGender;
	}
	public Date getAdminDateOfBirth() {
		return adminDateOfBirth;
	}
	public void setAdminDateOfBirth(Date adminDateOfBirth) {
		this.adminDateOfBirth = adminDateOfBirth;
	}
	
	
}
