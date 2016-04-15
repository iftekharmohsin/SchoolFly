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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


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
	private List<SectionHlo> sectionHlos;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "class_teacher_tb", joinColumns = { 
    @JoinColumn(name = "class_id")},inverseJoinColumns = { @JoinColumn(name = "teacher_id")})
	private List<TeacherHlo> teachers;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<EventHlo> eventHlos;
	
	//subject one to many
	
	/*
	@OneToMany
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name="THR_ID")
	private List<TeacherHlo> teachers;
*/
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
