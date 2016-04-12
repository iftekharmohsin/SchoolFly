package com.frozan.hlo;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.frozan.entity.Subject;

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

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="SCHOOL_ID")
	private SchoolHlo school;
	
    @OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@Column(name = "SUB_ID")
	@Fetch(FetchMode.JOIN)
	private Set<SubjectHlo> subjects;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name = "CLASS_ID")
	@Fetch(FetchMode.JOIN)
	private List<ClassHlo> classes;

	
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


	public SchoolHlo getSchool() {
		return school;
	}


	public void setSchool(SchoolHlo school) {
		this.school = school;
	}

/*	public Set<SubjectHlo> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<SubjectHlo> subjects) {
		this.subjects = subjects;
	}*/

/*	public List<ClassHlo> getClasses() {
		return classes;
	}


	public void setClasses(List<ClassHlo> classes) {
		this.classes = classes;
	}*/

}
