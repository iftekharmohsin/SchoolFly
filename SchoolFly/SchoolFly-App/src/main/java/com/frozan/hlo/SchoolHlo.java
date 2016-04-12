package com.frozan.hlo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="SCHOOL_TB")
public class SchoolHlo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SCHOOL_ID")
	private int id;
	
	@Column(name="SCHOOL_NAME")
	private String schoolName;
	
	@Column(name="SCHOOLADDRESS")
	private String schoolAddress;
	
	@OneToOne(fetch = FetchType.LAZY)
	private TeacherHlo teacher;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public TeacherHlo getTeacher() {
		return teacher;
	}
	public void setTeacher(TeacherHlo teacher) {
		this.teacher = teacher;
	}
	
}
