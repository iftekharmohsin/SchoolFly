package com.frozan.hlo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

}
