package com.frozan.hlo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	
<<<<<<< Updated upstream
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="SCHOOL_ID" , insertable = false, updatable = false)
	private List<TeacherHlo> teacherHlos;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="SCHOOL_ID" , insertable = false, updatable = false)
	private List<EventHlo>eventHlos;
	
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

	
=======
	@OneToOne(fetch = FetchType.LAZY)
	private TeacherHlo teacher;

>>>>>>> Stashed changes
}
