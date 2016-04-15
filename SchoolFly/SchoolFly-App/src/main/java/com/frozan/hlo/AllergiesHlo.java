package com.frozan.hlo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ALLERGIES_TB")
public class AllergiesHlo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ALLERGY_ID")
	private int id;
	
    @Column(name="AR_NAME")
	private String name;
    
	@Column(name="AR_DETAILS")
	private String details;
	
    @Column(name="AR_PRECAUTIONS")
	private String precautions;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STUDENT_ID", nullable = false)
    private StudentHlo student;

}
