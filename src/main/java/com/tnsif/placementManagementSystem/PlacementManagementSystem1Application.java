package com.tnsif.placementManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@EnableAutoConfiguration
@SpringBootApplication
public class PlacementManagementSystem1Application {

	public static void main(String[] args) {
		
	ApplicationContext context = SpringApplication.run(PlacementManagementSystem1Application.class, args);
//	CertificationRepository certificationRepository = context.getBean(CertificationRepository.class);
//	CollegeRepository collegeRepository = context.getBean(CollegeRepository.class);
//	PlacementRepository placementRepository = context.getBean(PlacementRepository.class);
//	StudentRepository studentRepository = context.getBean(StudentRepository.class);
	
	} 

}
