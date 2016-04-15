package com.frozan.hlo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DESTINATION")
public class DestinationHlo {

	@Id
	@Column(name="DESTINATION_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="LAND_MARK")
	private String landMark;
	
		
}
