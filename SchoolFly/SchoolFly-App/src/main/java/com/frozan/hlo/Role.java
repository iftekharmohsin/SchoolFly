package com.frozan.hlo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;
/**
 * Role Hibernate Entity
 * @author nagrjun.veerapu
 *
 */
@Entity
@Table(name="role_tb")
@Proxy(lazy=false)
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id")
	private int id;
	
	@Column(name = "role_name", unique = true, nullable = false)
	private String name;
	
	@Column(name = "role_designation", nullable = false)
	private String designation;
	
	public enum EN_ROLE_ASSOCIATED{
		PLATFORM,ORGANIZATION,PORTFOLIO,PROGRAM,PROJECT
	}
	@Column(name = "role_associated_level_to", nullable = false)
	private EN_ROLE_ASSOCIATED associatedLevelTo;
	
	@Column(name = "role_access_level", nullable = false)
	private int accessLevel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public EN_ROLE_ASSOCIATED getAssociatedLevelTo() {
		return associatedLevelTo;
	}

	public void setAssociatedLevelTo(EN_ROLE_ASSOCIATED associatedLevelTo) {
		this.associatedLevelTo = associatedLevelTo;
	}

	public int getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(int accessLevel) {
		this.accessLevel = accessLevel;
	}

	public int getId() {
		return id;
	}

	
}
