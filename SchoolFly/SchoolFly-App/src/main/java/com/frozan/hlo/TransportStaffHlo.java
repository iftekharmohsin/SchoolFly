package com.frozan.hlo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	
}
