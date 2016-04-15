package com.frozan.entity;

import java.util.Date;

public class Attendence {

	private int id;
	private Boolean isPresent;
	private Date attendenceDate;
	private String attendenceDay;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Boolean getIsPresent() {
		return isPresent;
	}
	public void setIsPresent(Boolean isPresent) {
		this.isPresent = isPresent;
	}
	public Date getAttendenceDate() {
		return attendenceDate;
	}
	public void setAttendenceDate(Date attendenceDate) {
		this.attendenceDate = attendenceDate;
	}
	public String getAttendenceDay() {
		return attendenceDay;
	}
	public void setAttendenceDay(String attendenceDay) {
		this.attendenceDay = attendenceDay;
	}
	
	
}
