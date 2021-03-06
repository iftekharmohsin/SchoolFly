package com.frozan.hlo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="BUS_TB")
public class BusHlo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="BUS_ID")
	private int id;
	
	@Column(name="BUS_NO")
	private String busNo;
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<TransportStaffHlo> transportStaffHlo;
  
	
	@OneToOne(fetch = FetchType.LAZY)
	private RouteHlo routeHlo;

	 @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="busHlo")
	private List<DestinationHlo> destinationHlos;
	
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
/*
	public List<TransportStaffHlo> getTransportStaffHlo() {
		return transportStaffHlo;
	}

	public void setTransportStaffHlo(List<TransportStaffHlo> transportStaffHlo) {
		this.transportStaffHlo = transportStaffHlo;
	}

	public RouteHlo getRouteHlo() {
		return routeHlo;
	}

	public void setRouteHlo(RouteHlo routeHlo) {
		this.routeHlo = routeHlo;
	}

	*/
}
