package com.frozan.hlo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BUS")
public class BusHlo {

	@Id
	@Column(name="BUS_ID")
	private int id;
	
	@Column(name="BUS_NO")
	private String busNo;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="BUS_ID" , insertable = false, updatable = false)
	private List<TransportStaffHlo> transportStaffHlo;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="BUS_ID")
	private RouteHlo routeHlo;

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
	public List<TransportStaffHlo> getTransportStaffHlo() {
		return transportStaffHlo;
	}
	public void setTransportStaffHlo(List<TransportStaffHlo> transportStaffHlo) {
		this.transportStaffHlo = transportStaffHlo;
	}
	public RouteHlo getHlo() {
		return routeHlo;
	}
	public void setHlo(RouteHlo hlo) {
		this.routeHlo = hlo;
	}


}
