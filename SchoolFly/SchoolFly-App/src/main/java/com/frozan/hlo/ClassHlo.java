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
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//	@Fetch(FetchMode.JOIN)
	@JoinColumn(name="SECTION_ID")
	private List<SectionHlo> sectionHlos;
	
	@OneToMany
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name="THR_ID")
	private List<TeacherHlo> teachers;

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

	public List<SectionHlo> getSectionHlos() {
		return sectionHlos;
	}

	public void setSectionHlos(List<SectionHlo> sectionHlos) {
		this.sectionHlos = sectionHlos;
	}

	public List<TeacherHlo> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<TeacherHlo> teachers) {
		this.teachers = teachers;
	}
}
