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
import javax.persistence.JoinColumn;
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
	
	@Column(name="PR_MIDDLE_NAME")
	private String middleName;
	
	@Column(name="PR_GENDER")
	private String gender;
	
	@Column(name="PR_DOB")
	private Date dob;
	
	@Column(name="PHONE_NO")
	private String phoneNo;
	
	 @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="parentHlos")
	 private List<StudentHlo> studentHlos;
	
	


}
