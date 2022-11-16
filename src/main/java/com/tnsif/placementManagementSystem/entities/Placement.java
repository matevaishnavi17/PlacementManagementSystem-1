package com.tnsif.placementManagementSystem.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name = "placement")
@NoArgsConstructor
@AllArgsConstructor
public class Placement {
	
	@Id
	private int id;
	private String name;
	@ManyToOne
	private College college;
	
	private LocalDate date;
	
	private String qualification;
	
	private int year;
}
