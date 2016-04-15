package com.frozan.hlo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TRANSPORT_STAFF")
public class TransportStaffHlo {

	@Id
	@Column(name="TRANSPORT_STAFF_ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="MOBILE_NO")
	private String mobileNo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "bus_id", nullable = false)
	 private BusHlo busHlo;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
}
