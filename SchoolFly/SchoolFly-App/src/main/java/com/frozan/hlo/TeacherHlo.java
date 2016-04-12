package com.frozan.hlo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TEACHER_TB")
public class TeacherHlo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="THR_ID")
	private int id;
	
	@Column(name="THR_FIRST_NAME")
	private String firstName;
	
	@Column(name="THR_LAST_NAME")
	private String lastName;
	
	@Column(name="THR_MIDDLE_NAME")
	private String middleName;
	
	@Column(name="THR_GENDER")
	private String gender;
	
	@Column(name="THR_DOB")
	private Date dob;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
}
