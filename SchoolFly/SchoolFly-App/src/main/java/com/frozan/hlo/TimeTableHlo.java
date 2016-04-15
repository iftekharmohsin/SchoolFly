package com.frozan.hlo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TIME_TABLE")
public class TimeTableHlo {

	@Id
	@Column(name="TIME_TABLE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="S_TIME")
	private String sTime;
	
	@Column(name="E_TIME")
	private String eTime;
	
	@Column(name="DAY")
    private String day;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getsTime() {
		return sTime;
	}

	public void setsTime(String sTime) {
		this.sTime = sTime;
	}

	public String geteTime() {
		return eTime;
	}

	public void seteTime(String eTime) {
		this.eTime = eTime;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	

}

