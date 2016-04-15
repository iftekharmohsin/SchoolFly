
package com.frozan.hlo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ATTENDENCE_TB")
public class AttendenceHlo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ATTENDENCE_ID")
    private	int id;
	
	@Column(name="PRESENT")
	private Boolean isPresent;
	
	@Column(name="ATTENDENCE_DATE")
	private Date attendenceDate;

	@Column(name="ATTENDENCE_DAY")
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
