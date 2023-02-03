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
@Table(name = "Cititzen_Kids")
public class Cititzen_Kids {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer kidId;
	private String kidName;
	private Integer kidAge;
	private String kidSsn;
	
	@ManyToOne
    @JoinColumn(name = "caseNumber")
    private Citizen_CaseNumber caseNumber;

}
