package com.frozan.hlo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EVENT")
public class EventHlo {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="EVENT_ID")
	private int id;

	@Column(name="EVNT_DATE")
	private Date evntDate;
	
	@Column(name="EVNT_TIME")
    private String evnttime;
	
	@Column(name="ADDRESS")
    private String address;
	
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "school_id", nullable = false)
	 private SchoolHlo schoolHlo;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "class_id", nullable = false)
	 private ClassHlo classHlo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
