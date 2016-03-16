package com.frozan.dao.timetable;


import javax.persistence.*;



@Entity
@Table(name="DAILY_TIME_TABLE")
public class DailyTimeTableHlo {
	
	
	private String classId;
	private String dayId;
	private String subject;
	private String startTime;
	private String endTime;
	private String teacher;
	private String dailyTimeTableId;
	
	@Id
	@Column(name="DAILY_TIME_TABLE_ID")
	public String getDailyTimeTableId() {
		return dailyTimeTableId;
	}
	public void setDailyTimeTableId(String dailyTimeTableId) {
		this.dailyTimeTableId = dailyTimeTableId;
	}
	@Column(name="CLASS_ID")
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	
	@Column(name="DAY_ID")
	public String getDayId() {
		return dayId;
	}
	public void setDayId(String dayId) {
		this.dayId = dayId;
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

	@Column(name="TEACHER")
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "DailyTimeTableHlo [classId=" + classId + ", dayId=" + dayId
				+ ", subject=" + subject + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", teacher=" + teacher
				+ ", dailyTimeTableId=" + dailyTimeTableId + "]";
	}
	

}
