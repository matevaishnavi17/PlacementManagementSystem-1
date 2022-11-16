package com.tnsif.placementManagementSystem.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name = "college")
@NoArgsConstructor
@AllArgsConstructor
public class College {

	@Id
	private int collegeId;
	@OneToOne
	private User admin;
	private String collegeName;
	private String location;

}
