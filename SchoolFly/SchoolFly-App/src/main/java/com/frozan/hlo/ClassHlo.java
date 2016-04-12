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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.OneToOne;import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name="CLASS_TB")
public class ClassHlo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CLASS_ID")
	private int id;

	@Column(name="CLASS_NAME")
	private String className;
	
	@ManyToOne
	@JoinColumn(name="SCHOOL_ID")
	private SchoolHlo school;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name="TEACHER_THR_ID")
	private List<TeacherHlo> teachers;

	public List<TeacherHlo> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<TeacherHlo> teachers) {
		this.teachers = teachers;
	}

	/*@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="STD_ID")
	private StudentHlo std;
	private StudentHlo std;	private StudentHlo std;*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}
