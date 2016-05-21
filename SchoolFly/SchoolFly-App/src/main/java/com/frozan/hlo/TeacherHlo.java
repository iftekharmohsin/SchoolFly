package com.frozan.hlo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	@Column(name="EMAIL")
	private Date email;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="THR_GENDER")
	private String gender;
	
	@Column(name="THR_DOB")
	private Date dob;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "class_teacher_tb", joinColumns = { 
    @JoinColumn(name = "teacher_id")},inverseJoinColumns = { @JoinColumn(name = "class_id")})
	private List<ClassHlo> classHlo;
	
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "school_id", nullable = false)
	 private SchoolHlo school;
	 
	 @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="teacherHlo")
	 private List<SubjectHlo> subjectHlos;
	 
	 @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	    @JoinTable(name = "section_teacher_tb", joinColumns = { 
	    @JoinColumn(name = "teacher_id")},inverseJoinColumns = { @JoinColumn(name = "section_id")})
		private List<SectionHlo> sectionHlos;
	 
	/*	
    @OneToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@Column(name = "SUB_ID", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Set<SubjectHlo> subjects;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name = "CLASS_ID")
	@Fetch(FetchMode.JOIN)
	private List<ClassHlo> classes;
*/
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

	public Date getEmail() {
		return email;
	}

	public void setEmail(Date email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<ClassHlo> getClassHlo() {
		return classHlo;
	}

	public void setClassHlo(List<ClassHlo> classHlo) {
		this.classHlo = classHlo;
	}

	public SchoolHlo getSchool() {
		return school;
	}

	public void setSchool(SchoolHlo school) {
		this.school = school;
	}

	public List<SubjectHlo> getSubjectHlos() {
		return subjectHlos;
	}

	public void setSubjectHlos(List<SubjectHlo> subjectHlos) {
		this.subjectHlos = subjectHlos;
	}

	public List<SectionHlo> getSectionHlos() {
		return sectionHlos;
	}

	public void setSectionHlos(List<SectionHlo> sectionHlos) {
		this.sectionHlos = sectionHlos;
	}


}
