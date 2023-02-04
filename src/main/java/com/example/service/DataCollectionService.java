package com.example.service;

import java.util.List;

import com.example.dto.EducationRequest;
import com.example.dto.IncomeRequest;
import com.example.dto.KidsRequest;
import com.example.dto.PlanRequest;

public interface DataCollectionService {
	
	public List<String> getPlanNames();
	
	public String savePlan(PlanRequest planRequest);
	
	public String saveEducation(EducationRequest educationRequest);
	
	public String saveIncome(IncomeRequest IncomeRequest);
	
	public String saveKids(KidsRequest KidsRequest);

}
