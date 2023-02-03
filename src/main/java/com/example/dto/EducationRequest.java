package com.example.dto;

import java.util.Date;

import lombok.Data;

@Data
public class EducationRequest {

	private String HighestDegree;
	private String universityName;
	private Date graduationYear;
}
