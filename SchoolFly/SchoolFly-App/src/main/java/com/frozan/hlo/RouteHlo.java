package com.frozan.hlo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROUTE")
public class RouteHlo {

	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	
	}
