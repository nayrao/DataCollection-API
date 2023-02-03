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
@Table(name = "Citizen_Income")
public class Citizen_Income {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer incomeId;
	private Long monthlySalaryIncome;
	private Long rentIncome;
	private Long propertyIncome;
	
	@ManyToOne
    @JoinColumn(name = "caseNumber")
    private Citizen_CaseNumber caseNumber;

}
