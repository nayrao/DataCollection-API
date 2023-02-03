package com.example.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Citizen_Plan;

public interface CitizenPlanRepo extends JpaRepository<Citizen_Plan, Serializable> {

}
