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

@Entity
@Table(name="Exam")
public class ExamHlo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="EXAM_ID")
	private int id;
	
	@OneToOne
	@JoinColumn(name="Exam_Time_Table_Id")
	private ExamTimeTableHlo examTimeTableHlo;
	
	@Column(name="EXAM_DATE")
	private Date examDate;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ExamTimeTableHlo getExamTimeTableHlo() {
		return examTimeTableHlo;
	}

	public void setExamTimeTableHlo(ExamTimeTableHlo examTimeTableHlo) {
		this.examTimeTableHlo = examTimeTableHlo;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}
}
