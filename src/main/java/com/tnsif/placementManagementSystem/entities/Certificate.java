package com.tnsif.placementManagementSystem.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;



@Data
@Entity
@Table(name = "certificate")
public class Certificate {
	@Id
	private int id;
	private int year;
	
	@ManyToOne
	private College Name;
	
}
