package com.frozan.hlo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="EXAM_TIME_TABLE_TB")
public class ExamTimeTableHlo {

	@Id
	@Column(name="Exam_Time_Table_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int examTimeTableId;
	private String classId;
	private String examDay;
	private String subject;
	private String startTime;
	private String endTime;
	
	public int getExamtimeTableId() {
		return examTimeTableId;
	}
	public void setExamtimeTableId(int examtimeTableId) {
		this.examTimeTableId = examtimeTableId;
	}

	@Column(name="CLASS_ID")
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	@Column(name="EXAM_DAY")
	public String getExamDay() {
		return examDay;
	}
	public void setExamDay(String examDay) {
		this.examDay = examDay;
	}
	@Column(name="SUBJECT")
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Column(name="START_TIME")
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	@Column(name="END_TIME")
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "ExamTimeTableHlo [examTimeTableId=" + examTimeTableId
				+ ", classId=" + classId + ", examDay=" + examDay
				+ ", subject=" + subject + ", startTime=" + startTime
				+ ", endTime=" + endTime + "]";
	}

}
