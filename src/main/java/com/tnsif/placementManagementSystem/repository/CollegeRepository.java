package com.tnsif.placementManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.placementManagementSystem.entities.College;
public interface CollegeRepository extends JpaRepository<College, Integer> {

}
