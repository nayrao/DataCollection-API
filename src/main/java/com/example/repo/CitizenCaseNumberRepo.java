package com.example.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Citizen_CaseNumber;

public interface CitizenCaseNumberRepo extends JpaRepository<Citizen_CaseNumber, Serializable>{

}
