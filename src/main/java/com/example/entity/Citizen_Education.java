package com.example.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "itizen_Education ")
public class Citizen_Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer educationId;
	private String HighestDegree;
	private String universityName;
	private Date graduationYear;
	

	@ManyToOne
    @JoinColumn(name = "caseNumber")
    private Citizen_CaseNumber caseNumber;
}
