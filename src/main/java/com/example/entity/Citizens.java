package com.example.entity;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "CITIZENS")
public class Citizens {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer appId;
	private String fullName;
	private String email;
	private Long mobileNumber;
	private String gender;
	private LocalDate dob;
	private String ssn;
	@CreationTimestamp
	private LocalDate createdDate;
	@UpdateTimestamp
	private LocalDate updatedDate;
	
	private String createdBy;
	private String updatedBy;
	
	
	
}