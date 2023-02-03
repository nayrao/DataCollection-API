package com.example.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Citizen_Education;

public interface CitizenEducationRepo extends JpaRepository<Citizen_Education, Serializable> {

}
