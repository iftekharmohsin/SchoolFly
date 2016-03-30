package com.frozan.hlo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EVENT")
public class EventHlo {


	@Id
	@Column(name="ID")
	private int id;
	//TODO:mapping
	private int schoolId;
	@Column(name="EVNT_DATE")
	private Date evntDate;
	@Column(name="EVNT_TIME")
    private String evnttime;
	@Column(name="ADDRESS")
    private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	public Date getEvntDate() {
		return evntDate;
	}
	public void setEvntDate(Date evntDate) {
		this.evntDate = evntDate;
	}
	public String getEvnttime() {
		return evnttime;
	}
	public void setEvnttime(String evnttime) {
		this.evnttime = evnttime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
}
