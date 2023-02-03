package com.example.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Citizen_Income;

public interface CitizenIncomeRepo extends JpaRepository<Citizen_Income, Serializable> {

}
