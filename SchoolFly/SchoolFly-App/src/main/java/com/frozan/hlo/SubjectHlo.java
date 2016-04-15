package com.frozan.hlo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SUBJECT_TB")
public class SubjectHlo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SUB_ID")
	private int id;

	@Column(name="SUB_NAME")
	private String name;
	
	@Column(name="SUB_CODE")
	private String subjectCode;
	
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "THR_ID", nullable = false)
     private TeacherHlo teacherHlo;
	 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

}
