package com.frozan.hlo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name="EXAM_TIME_TABLE_TB")
public class ExamTimeTableHlo {

	@Id
	@Column(name="Exam_Time_Table_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int examTimeTableId;
	
	@OneToOne
	@JoinColumn(name="SECTION_ID")
//	@Fetch(FetchMode.JOIN)
	private SectionHlo sectionHlo;
	
	@Column(name="EXAM_DATE")
	private Date examDate;

	@OneToOne
	@JoinColumn(name="SUB_ID")
	private SubjectHlo subjectHlo;
	
	@Column(name="START_TIME")
	private Date examStartTime;
	
	@Column(name="END_TIME")
	private Date examEndTime;

	public int getExamTimeTableId() {
		return examTimeTableId;
	}

	public void setExamTimeTableId(int examTimeTableId) {
		this.examTimeTableId = examTimeTableId;
	}
	
	public SectionHlo getSectionHlo() {
		return sectionHlo;
	}

	public void setSectionHlo(SectionHlo sectionHlo) {
		this.sectionHlo = sectionHlo;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public SubjectHlo getSubjectHlo() {
		return subjectHlo;
	}

	public void setSubjectHlo(SubjectHlo subjectHlo) {
		this.subjectHlo = subjectHlo;
	}

	public Date getExamStartTime() {
		return examStartTime;
	}

	public void setExamStartTime(Date examStartTime) {
		this.examStartTime = examStartTime;
	}

	public Date getExamEndTime() {
		return examEndTime;
	}

	public void setExamEndTime(Date examEndTime) {
		this.examEndTime = examEndTime;
	}
}
