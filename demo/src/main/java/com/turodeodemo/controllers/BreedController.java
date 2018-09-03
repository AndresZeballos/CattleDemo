package com.turodeodemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turodeodemo.models.Breed;
import com.turodeodemo.repositories.BreedRepository;

@RestController
public class BreedController {

	@Autowired
	private final BreedRepository repository;

	BreedController(BreedRepository repository) {
		this.repository = repository;
	}

	// Aggregate root

	@GetMapping("/breeds")
	List<Breed> all() {
		return repository.findAll();
	}
}
