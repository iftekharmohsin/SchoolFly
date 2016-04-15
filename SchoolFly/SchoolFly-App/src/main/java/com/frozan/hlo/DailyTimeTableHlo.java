package com.frozan.hlo;
import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="DAILY_TIME_TABLE_TB")
public class DailyTimeTableHlo {

	@Id
	@Column(name="DAILY_TIME_TABLE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dailyTimeTableId;
	
	@Column(name="SUBJECT")
	private String subject;
	
	@Column(name="START_TIME")
	private String startTime;
	
	@Column(name="END_TIME")
	private String endTime;
	
	@Column(name="TEACHER")
	private String teacher;
	
	@OneToOne
	@JoinColumn(name="SECTION_ID")
	@Fetch(FetchMode.JOIN)
	private SectionHlo sectionHlo;	

	public int getDailyTimeTableId() {
		
		return dailyTimeTableId;
	}
	public void setDailyTimeTableId(int dailyTimeTableId) {
		this.dailyTimeTableId = dailyTimeTableId;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	

	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	

	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public SectionHlo getSectionHlo() {
		return sectionHlo;
	}
	public void setSectionHlo(SectionHlo sectionHlo) {
		this.sectionHlo = sectionHlo;
	}

}
