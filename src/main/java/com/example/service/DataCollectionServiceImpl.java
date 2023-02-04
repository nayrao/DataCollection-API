package com.example.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.dto.EducationRequest;
import com.example.dto.IncomeRequest;
import com.example.dto.KidsRequest;
import com.example.dto.PlanRequest;
import com.example.entity.Cititzen_Kids;
import com.example.entity.Citizen_Education;
import com.example.entity.Citizen_Income;
import com.example.repo.CitizenEducationRepo;
import com.example.repo.CitizenIncomeRepo;
import com.example.repo.CitizenKidsRepo;

public class DataCollectionServiceImpl implements DataCollectionService{
	
	@Autowired
	private CitizenEducationRepo citizenEducationRepo;
	
	@Autowired
	private CitizenIncomeRepo incomeRepo;
	
	@Autowired
	private CitizenKidsRepo kidsRepo;

	@Override
	public List<String> getPlanNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String savePlan(PlanRequest planRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveEducation(EducationRequest educationRequest) {
		Citizen_Education education=new Citizen_Education();
		BeanUtils.copyProperties(educationRequest, education);
		education.setGraduationYear(educationRequest.getGraduationYear());
		education.setHighestDegree(educationRequest.getHighestDegree());
		education.setUniversityName(educationRequest.getUniversityName());
		citizenEducationRepo.save(education);
		return "Citizen Education Details are Enterd";
	}

	@Override
	public String saveIncome(IncomeRequest incomeRequest) {
		Citizen_Income income=new Citizen_Income();
		BeanUtils.copyProperties(incomeRequest, income);
		income.setMonthlySalaryIncome(incomeRequest.getMonthlySalaryIncome());
		income.setPropertyIncome(incomeRequest.getPropertyIncome());
		income.setRentIncome(incomeRequest.getRentIncome());
		incomeRepo.save(income);
		return "Citizen Income Details are Enterd";
	}

	@Override
	public String saveKids(KidsRequest kidsRequest) {
		Cititzen_Kids kids=new Cititzen_Kids();
		BeanUtils.copyProperties(kidsRequest, kids);
		kids.setKidAge(kidsRequest.getKidAge());
		kids.setKidName(kidsRequest.getKidName());
        kids.setKidSsn(kidsRequest.getKidSsn());
        kidsRepo.save(kids);
		return "Citizen Income Details are Enterd";
	}

}
