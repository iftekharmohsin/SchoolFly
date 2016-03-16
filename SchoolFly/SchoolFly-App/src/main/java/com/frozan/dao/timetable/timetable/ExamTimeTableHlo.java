package com.frozan.dao.timetable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="EXAM_TIME_TABLE")
public class ExamTimeTableHlo {
	
	private String examTimeTableId;
	private String classId;
	private String examDay;
	private String subject;
	private String startTime;
	private String endTime;
	
	@Id
	@Column(name="Exam_Time_Table_Id")
	public String getExamtimeTableId() {
		return examTimeTableId;
	}
	public void setExamtimeTableId(String examtimeTableId) {
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
