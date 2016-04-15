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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="SECTION_TB")
public class SectionHlo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SECTION_ID")
	private int id;
	
	@Column(name="SECTION_NAME")
	private String sectionName;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name="TEACHER_THR_ID")
	private List<TeacherHlo> teachers;
	
	/*@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="STUDENT_ID")
	@Fetch(FetchMode.JOIN)
	private List<StudentHlo> studentHlos;*/

	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="SUB_ID")
	@Fetch(FetchMode.JOIN)
	private List<SubjectHlo> subjectHlos;
	
	@OneToOne
	@JoinColumn(name="SECTION_ID")
	private DailyTimeTableHlo dailyTimeTableHlo;
	
	@OneToMany
	@JoinColumn(name="EXAM_ID" , insertable = false, updatable = false)
	private List<ExamHlo> examHlos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public List<TeacherHlo> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<TeacherHlo> teachers) {
		this.teachers = teachers;
	}
/*//
//	public List<StudentHlo> getStudentHlos() {
//		return studentHlos;
//	}
//
//	public void setStudentHlos(List<StudentHlo> studentHlos) {
//		this.studentHlos = studentHlos;
//	}
*/
	public List<SubjectHlo> getSubjectHlos() {
		return subjectHlos;
	}

	public void setSubjectHlos(List<SubjectHlo> subjectHlos) {
		this.subjectHlos = subjectHlos;
	}

	public DailyTimeTableHlo getDailyTimeTableHlo() {
		return dailyTimeTableHlo;
	}

	public void setDailyTimeTableHlo(DailyTimeTableHlo dailyTimeTableHlo) {
		this.dailyTimeTableHlo = dailyTimeTableHlo;
	}

	public List<ExamHlo> getExamHlos() {
		return examHlos;
	}

	public void setExamHlos(List<ExamHlo> examHlos) {
		this.examHlos = examHlos;
	}
}
