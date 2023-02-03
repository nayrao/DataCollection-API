package com.example.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Citizens;

public interface CitizenRepo extends JpaRepository<Citizens, Serializable> {

}
