package com.frozan.hlo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;

import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Proxy;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="user_tb")
@Proxy(lazy=false)
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int id;

	@Column(name = "username", unique = true, nullable = false)
	private String name;

	@Column(name = "user_email", unique = true, nullable = false)
	private String email;

	@Column(name = "user_employee_id", unique = true, nullable = false)
	private int employeeId ;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "user_state", nullable = false)
	private boolean enabled;

	@ManyToMany(fetch = FetchType.LAZY,targetEntity=Role.class)
	@JsonIgnore
	@JoinTable(name="user_roles_tb",
	joinColumns={@JoinColumn(name="user_id")},
	inverseJoinColumns={@JoinColumn(name="role_id")})
	@OrderBy("name")
	@Fetch(FetchMode.JOIN)
	private Set<Role> roles = new HashSet<Role>();

	/*@ManyToMany(fetch = FetchType.LAZY,targetEntity=Project.class)
	@JsonIgnore
	@JoinTable(name="user_projects_tb",
	joinColumns={@JoinColumn(name="user_id")},
	inverseJoinColumns={@JoinColumn(name="project_id")})
	@Fetch(FetchMode.JOIN)
	@OrderBy("name")
	private Set<Project> projects = new HashSet<Project>();*/

	public User(){

	}

	public User(String name, int employeeId, String email, String password, boolean enabled) {
		this.name = name;
		this.employeeId = employeeId;
		this.email = email;
		this.password = password;
		this.enabled = enabled;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void addRole(Role role) {
		if(roles != null && !roles.isEmpty()){
			roles.add(role);
		}else{
			roles = new HashSet<Role>();
			roles.add(role);
		}
	}

	public void removeRole(Role role) {
		if(roles != null && !roles.isEmpty()){
			roles.remove(role);
		}
	}

	public Set<Role> getRoles() {
		return roles;
	}
	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
