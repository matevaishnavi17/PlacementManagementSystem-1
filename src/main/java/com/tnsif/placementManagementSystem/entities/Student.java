package com.tnsif.placementManagementSystem.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	private int studentid;
	private String studentName;
	private int studentRoll;
	private String studentQualification;
	private String studentCourse;
	private int studentYear;
	private int studentHallTicketNo;
	@ManyToOne
	private College college;
	
	
	@OneToOne
	private Certificate certificate;
	
	
}
