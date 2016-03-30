package com.frozan.hlo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BUS")
public class BusHlo {

	@Id
	@Column(name="ID")
	private int id;
	@Column(name="BUS_NO")
	private String busNo;
	//TODO:mapping

	private int routeId;
	//TODO:mapping
	private int  transportStaffId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public int getTransportStaffId() {
		return transportStaffId;
	}
	public void setTransportStaffId(int transportStaffId) {
		this.transportStaffId = transportStaffId;
	}

}
