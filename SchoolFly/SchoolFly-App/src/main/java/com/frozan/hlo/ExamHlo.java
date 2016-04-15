package com.frozan.hlo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Exam")
public class ExamHlo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< Updated upstream
	@Column(name="EXAM_ID")
	private int id;
	
	@OneToOne
	@JoinColumn(name="Exam_Time_Table_Id")
	private ExamTimeTableHlo examTimeTableHlo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ExamTimeTableHlo getExamTimeTableHlo() {
		return examTimeTableHlo;
	}

	public void setExamTimeTableHlo(ExamTimeTableHlo examTimeTableHlo) {
		this.examTimeTableHlo = examTimeTableHlo;
	}
	
=======
	@Column(name = "PARENT_ID")
	private int id;
	
	@Column(name="EXAM_DATE")
	private Date examDate;
>>>>>>> Stashed changes
	
}
