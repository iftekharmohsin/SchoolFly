package com.frozan.hlo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PARENT_TB")
public class ParentHlo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PARENT_ID")
	private int id;
	
	@Column(name="PR_FIRST_NAME")
	private String firstName;
	
	@Column(name="PR_LAST_NAME")
	private String lastName;
	
	@Column(name="PR_GENDER")
	private String gender;
	
	@Column(name="PR_DOB")
	private Date dob;
	
	@Column(name="PHONE_NO")
	private String phoneNo;
	
	@Column(name="EMAIL")
	private String email;

	@Column(name="PR_PASSWORD")
	private String password;

	@Column(name="PR_REPASSWORD")
	private String rePassword;
	
	 @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="parentHlos")
	 private List<StudentHlo> studentHlos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public List<StudentHlo> getStudentHlos() {
		return studentHlos;
	}

	public void setStudentHlos(List<StudentHlo> studentHlos) {
		this.studentHlos = studentHlos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRePassword() {
		return rePassword;
	}

	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}
	
	


}
