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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="STUDENT_TB")
public class StudentHlo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="STUDENT_ID")
	private int  id;
	
	@Column(name="STD_FIRST_NAME")
	private String stdFirstName;

	@Column(name="STD_LAST_NAME")
	private String stdLastName;
	
	@Column(name="STD_MIDDLE_NAME")
	private String stdMiddleName;
	
	
	@Column(name="STD_GENDER")
	private String stdGender;
	
	@Column(name="STD_DOB")
	private Date stdDateOfBirth;

	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private ClassHlo stdClass;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private SchoolHlo school;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@Fetch(FetchMode.JOIN)
	@JoinColumn(name="STUDENT_ID" , insertable = false, updatable = false)
	private List<AllergiesHlo> allergiesHlo;
	
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name="BUS_ID" , insertable = false, updatable = false)
	private List<BusHlo> busHlos;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@Fetch(FetchMode.JOIN)
	@JoinColumn(name="CLASS_ID" , insertable = false, updatable = false)
	private ClassHlo classHlo;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@Fetch(FetchMode.JOIN)
	@JoinColumn(name="DAILY_TIME_TABLE_ID", insertable = false, updatable = false)
	private DailyTimeTableHlo dailyTimeTableHlo;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@Fetch(FetchMode.JOIN)
	@JoinColumn(name="DESTINATION_ID", insertable = false, updatable = false)
	private DestinationHlo destinationHlo;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@Fetch(FetchMode.JOIN)
	@JoinColumn(name="STUDENT_ID" , insertable = false, updatable = false )
	private List<EventHlo> eventHlos;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name="PARENT_ID" , insertable = false, updatable = false)
	private List<ParentHlo> parentHlos;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@Fetch(FetchMode.JOIN)
	@JoinColumn(name="STUDENT_ID" , insertable = false, updatable = false)
	private  List<ExamHlo> examHlos;
	
    //@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@Fetch(FetchMode.JOIN)
	@JsonIgnore
	@JoinColumn(name="Exam_Time_Table_ID" , insertable = false, updatable = false)
	private List<ExamTimeTableHlo> examTimeTableHlos;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@Fetch(FetchMode.JOIN)
	@JoinColumn(name="SCHOOL_ID", insertable = false, updatable = false)
	private SchoolHlo schoolHlo;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name="THR_ID" , insertable = false, updatable = false)
	private List<TeacherHlo> teacherHlos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStdFirstName() {
		return stdFirstName;
	}

	public void setStdFirstName(String stdFirstName) {
		this.stdFirstName = stdFirstName;
	}

	public String getStdLastName() {
		return stdLastName;
	}

	public void setStdLastName(String stdLastName) {
		this.stdLastName = stdLastName;
	}

	public String getStdMiddleName() {
		return stdMiddleName;
	}

	public void setStdMiddleName(String stdMiddleName) {
		this.stdMiddleName = stdMiddleName;
	}

	public String getStdGender() {
		return stdGender;
	}

	public void setStdGender(String stdGender) {
		this.stdGender = stdGender;
	}

	public Date getStdDateOfBirth() {
		return stdDateOfBirth;
	}

	public void setStdDateOfBirth(Date stdDateOfBirth) {
		this.stdDateOfBirth = stdDateOfBirth;
	}

	public ClassHlo getStdClass() {
		return stdClass;
	}

	public void setStdClass(ClassHlo stdClass) {
		this.stdClass = stdClass;
	}

	public SchoolHlo getSchool() {
		return school;
	}

	public void setSchool(SchoolHlo school) {
		this.school = school;
	}

	public List<AllergiesHlo> getAllergiesHlo() {
		return allergiesHlo;
	}

	public void setAllergiesHlo(List<AllergiesHlo> allergiesHlo) {
		this.allergiesHlo = allergiesHlo;
	}

	public List<BusHlo> getBusHlos() {
		return busHlos;
	}

	public void setBusHlos(List<BusHlo> busHlos) {
		this.busHlos = busHlos;
	}

	public ClassHlo getClassHlo() {
		return classHlo;
	}

	public void setClassHlo(ClassHlo classHlo) {
		this.classHlo = classHlo;
	}

	public DailyTimeTableHlo getDailyTimeTableHlo() {
		return dailyTimeTableHlo;
	}

	public void setDailyTimeTableHlo(DailyTimeTableHlo dailyTimeTableHlo) {
		this.dailyTimeTableHlo = dailyTimeTableHlo;
	}

	public DestinationHlo getDestinationHlo() {
		return destinationHlo;
	}

	public void setDestinationHlo(DestinationHlo destinationHlo) {
		this.destinationHlo = destinationHlo;
	}

	public List<EventHlo> getEventHlos() {
		return eventHlos;
	}

	public void setEventHlos(List<EventHlo> eventHlos) {
		this.eventHlos = eventHlos;
	}

	public List<ParentHlo> getParentHlos() {
		return parentHlos;
	}

	public void setParentHlos(List<ParentHlo> parentHlos) {
		this.parentHlos = parentHlos;
	}

	public List<ExamHlo> getExamHlos() {
		return examHlos;
	}

	public void setExamHlos(List<ExamHlo> examHlos) {
		this.examHlos = examHlos;
	}

	public List<ExamTimeTableHlo> getExamTimeTableHlos() {
		return examTimeTableHlos;
	}

	public void setExamTimeTableHlos(List<ExamTimeTableHlo> examTimeTableHlos) {
		this.examTimeTableHlos = examTimeTableHlos;
	}

	public SchoolHlo getSchoolHlo() {
		return schoolHlo;
	}

	public void setSchoolHlo(SchoolHlo schoolHlo) {
		this.schoolHlo = schoolHlo;
	}

	public List<TeacherHlo> getTeacherHlos() {
		return teacherHlos;
	}

	public void setTeacherHlos(List<TeacherHlo> teacherHlos) {
		this.teacherHlos = teacherHlos;
	}

}
