package com.example.entity;

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
@Table(name = "CITIZEN_CASETBL")
public class Citizen_CaseNumber {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer caseNumber;
	
	@ManyToOne
    @JoinColumn(name = "appId")
    private Citizens citizen;
}
