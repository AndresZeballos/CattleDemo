package com.turodeodemo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.turodeodemo.models.Cattle;
import com.turodeodemo.repositories.CattleRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CattleController {

	@Autowired
	private final CattleRepository repository;

	CattleController(CattleRepository repository) {
		this.repository = repository;
	}

	// Aggregate root

	@GetMapping("/cattles")
	List<Cattle> all() {
		return repository.findAll();
	}
	
	@GetMapping("/cattles/count")
	long count() {
		return repository.count();
	}

	@PostMapping("/cattles")
	Cattle newEmployee(@RequestBody Cattle newCattle) {
		System.out.println(newCattle);
		System.out.println(newCattle.getBreed());
		return repository.save(newCattle);
	}

	// Single item

	@GetMapping("/cattles/{tagNumber}")
	Optional<Cattle> one(@PathVariable String tagNumber) {

		return repository.findById(tagNumber);//.orElseThrow(() -> new CattleNotFoundException(id));
	}

	@PutMapping("/cattles/{tagNumber}")
	Optional<Object> replaceEmployee(@RequestBody Cattle newCattle, @PathVariable String tagNumber) {

		return repository.findById(tagNumber)
			.map(cattle -> {
				cattle.setBreed(newCattle.getBreed());
				cattle.setGender(newCattle.getGender());
				return repository.save(cattle);
			});
	}

	@DeleteMapping("/cattles/{tagNumber}")
	void deleteEmployee(@PathVariable String tagNumber) {
		repository.deleteById(tagNumber);
	}
}
