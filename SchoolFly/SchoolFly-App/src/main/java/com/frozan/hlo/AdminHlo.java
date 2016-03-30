package com.frozan.hlo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ADMIN_TB")
public class AdminHlo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "admin_id")

	private int id;
	private String adminFirstName;
	private String adminLastName;
	private String adminMiddleName;
	private String adminGender;
	private Date adminDateOfBirth;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
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
