package com.tnsif.placementManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.placementManagementSystem.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
//	User findByUsernameAndPassword(String username, String password);

}
