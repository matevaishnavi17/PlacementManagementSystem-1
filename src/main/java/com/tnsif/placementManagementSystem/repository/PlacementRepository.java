package com.tnsif.placementManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.placementManagementSystem.entities.Placement;

public interface PlacementRepository extends JpaRepository<Placement, Integer>{

}
