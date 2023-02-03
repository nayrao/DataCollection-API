package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "CITIZENS_PLAN")
public class Citizen_Plan {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Integer planId;
	
	private String planName;
	
	@ManyToOne
    @JoinColumn(name = "caseNumber")
    private Citizen_CaseNumber caseNumber;

}
