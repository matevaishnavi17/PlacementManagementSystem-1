package com.tnsif.placementManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.placementManagementSystem.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
