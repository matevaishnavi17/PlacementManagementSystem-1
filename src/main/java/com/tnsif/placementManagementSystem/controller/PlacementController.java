package com.tnsif.placementManagementSystem.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.placementManagementSystem.entities.Placement;
import com.tnsif.placementManagementSystem.services.PlacementServiceImpl;
@CrossOrigin(origins = "*")
@RestController
public class PlacementController {

	@Autowired
	private PlacementServiceImpl service;

	// RESTful API methods for Retrieval operations
	@GetMapping("/placements")
	public List<Placement> list() {
		return service.listAll();
	}

	@GetMapping("/placements/{id}")
	public ResponseEntity<Placement> get(@PathVariable Integer id) {
		try {
			Placement placement = service.get(id);
			return new ResponseEntity<Placement>(placement, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
		}
	}

	// RESTful API method for Create operation
	@PostMapping("/placements")
	public void add(@RequestBody Placement placement) {
		service.save(placement);
	}

	// RESTful API method for Update operation
	@PutMapping("/placements/{id}")
	public ResponseEntity<?> update(@RequestBody Placement placement, @PathVariable Integer id) {
		try {
			Placement existPlacement = service.get(id);
			service.save(placement);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// RESTful API method for Delete operation
	@DeleteMapping("/placements/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

}