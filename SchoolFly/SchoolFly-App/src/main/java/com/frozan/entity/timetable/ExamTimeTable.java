package com.frozan.model.timetable;

public class ExamTimeTable {

	private String classId;
	private String examDay;
	private String subject;
	private String startTime;
    private String endTime;
    private String examTimeTableId;
    
    
	public String getExamTimeTableId() {
		return examTimeTableId;
	}
	public void setExamTimeTableId(String examTimeTableId) {
		this.examTimeTableId = examTimeTableId;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getExamDay() {
		return examDay;
	}
	public void setExamDay(String examDay) {
		this.examDay = examDay;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
    

	@Override
	public String toString() {
		return "ExamTimeTable [classId=" + classId + ", examDay=" + examDay
				+ ", subject=" + subject + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", examTimeTableId="
				+ examTimeTableId + "]";
	}
}
