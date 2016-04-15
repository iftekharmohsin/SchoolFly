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

<<<<<<< Updated upstream
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
=======
import com.fasterxml.jackson.annotation.JsonIgnore;
>>>>>>> Stashed changes

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
	
<<<<<<< Updated upstream
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@Fetch(FetchMode.JOIN)
	@JoinColumn(name="STUDENT_ID" , insertable = false, updatable = false)
	private List<AllergiesHlo> allergiesHlo;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@Fetch(FetchMode.JOIN)
	@JoinColumn(name="STUDENT_ID" , insertable = false, updatable = false)
=======
	@Column(name="STD_GENDER")
	private String stdGender;
	
	@Column(name="STD_DOB")
	private Date stdDateOfBirth;

	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private ClassHlo stdClass;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private SchoolHlo school;

	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<AllergiesHlo> allergiesHlo;
	
	/*@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name="BUS_ID" , insertable = false, updatable = false)
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
	//@Fetch(FetchMode.JOIN)
	@JoinColumn(name="STUDENT_ID" , insertable = false, updatable = false )
	private List<EventHlo> eventHlos;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@Fetch(FetchMode.JOIN)
	@JoinColumn(name="STUDENT_ID" , insertable = false, updatable = false)
=======
	@JsonIgnore
	@JoinColumn(name="EVENT_ID" , insertable = false, updatable = false )
	private List<EventHlo> eventHlos;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name="PARENT_ID" , insertable = false, updatable = false)
>>>>>>> Stashed changes
	private List<ParentHlo> parentHlos;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@Fetch(FetchMode.JOIN)
	@JoinColumn(name="STUDENT_ID" , insertable = false, updatable = false)
	private  List<ExamHlo> examHlos;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
<<<<<<< Updated upstream
	//@Fetch(FetchMode.JOIN)
	@JoinColumn(name="STUDENT_ID" , insertable = false, updatable = false)
=======
	@JsonIgnore
	@JoinColumn(name="Exam_Time_Table_ID" , insertable = false, updatable = false)
>>>>>>> Stashed changes
	private List<ExamTimeTableHlo> examTimeTableHlos;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@Fetch(FetchMode.JOIN)
	@JoinColumn(name="SCHOOL_ID", insertable = false, updatable = false)
	private SchoolHlo schoolHlo;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
<<<<<<< Updated upstream
	@JoinColumn(name="STUDENT_ID" , insertable = false, updatable = false)
=======
	@JsonIgnore
	@JoinColumn(name="THR_ID" , insertable = false, updatable = false)
>>>>>>> Stashed changes
	private List<TeacherHlo> teacherHlos;
*/
}
