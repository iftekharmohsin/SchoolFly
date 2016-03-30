package com.frozan.hlo;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_TB")
public class StudentHlo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="STUDENT_ID")
	private int  id;
	
	@Column(name="STD_FIRST_NAME")
	private String stdFirstName;

	@Column(name="STD_LAST_NAME")
	private String stdLastName;
	
	@Column(name="STD_MIDDLE_NAME")
	private String stdMiddleName;
	
	@Column(name="STD_GENDER")
	private String stdGender;
	
	@Column(name="STD_DOB")
	private Date stdDateOfBirth;

	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="CLASS_ID")
	private ClassHlo stdClass;
	
    //@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	//@Column(name="TEACHER_ID")
    //private List<TeacherHlo> teachers;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStdFirstName() {
		return stdFirstName;
	}
	public void setStdFirstName(String stdFirstName) {
		this.stdFirstName = stdFirstName;
	}
	public String getStdLastName() {
		return stdLastName;
	}
	public void setStdLastName(String stdLastName) {
		this.stdLastName = stdLastName;
	}
	public String getStdMiddleName() {
		return stdMiddleName;
	}
	public void setStdMiddleName(String stdMiddleName) {
		this.stdMiddleName = stdMiddleName;
	}
	public String getStdGender() {
		return stdGender;
	}
	public void setStdGender(String stdGender) {
		this.stdGender = stdGender;
	}
	public Date getStdDateOfBirth() {
		return stdDateOfBirth;
	}
	public void setStdDateOfBirth(Date stdDateOfBirth) {
		this.stdDateOfBirth = stdDateOfBirth;
	}
}
