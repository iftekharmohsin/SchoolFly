package com.frozan.hlo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.frozan.entity.Admin;
import com.frozan.entity.Event;
import com.frozan.entity.Student;
import com.frozan.entity.Teacher;

@Entity
@Table
public class SchoolHlo {

	
	private String schoolId;
	private String schoolName;
	private String schoolAddress;
	private List<Student> studentList;
	private List<Teacher> teacherList;
	private Admin admin;
	private List<Event> eventList;
	
	@Id
	@Column(name="SCHOOLID")
	public String getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}
	
	@Column(name="SCHOOLNAME")
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	@Column(name="SCHOOLADDRESS")
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	//TODO:MAPPING  
	@OneToMany
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	//TODO:MAPPING
	@OneToMany
	public List<Teacher> getTeacherList() {
		return teacherList;
	}
	public void setTeacherList(List<Teacher> teacherList) {
		this.teacherList = teacherList;
	}
	//TODO:MAPPING
	@OneToOne
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	//TODO:MAPPING
	@OneToMany
	public List<Event> getEventList() {
		return eventList;
	}
	public void setEventList(List<Event> eventList) {
		this.eventList = eventList;
	}
}
