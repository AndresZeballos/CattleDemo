package com.turodeodemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turodeodemo.models.Breed;

public interface BreedRepository  extends JpaRepository<Breed, Long> {

}
