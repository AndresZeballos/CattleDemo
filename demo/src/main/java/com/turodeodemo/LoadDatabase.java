package com.turodeodemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.turodeodemo.models.Breed;
import com.turodeodemo.repositories.BreedRepository;

public class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(BreedRepository repository) {
		return args -> {
			repository.save(new Breed("ABERDEEN_ANGUS"));
			repository.save(new Breed("BRANGUS"));
			repository.save(new Breed("CARETA"));
			repository.save(new Breed("CRIOLLA"));
			repository.save(new Breed("HEREFORD"));
			repository.save(new Breed("PAMPA"));
			repository.save(new Breed("SIMMENTA"));
			repository.save(new Breed("CHAROLAIS"));
			repository.save(new Breed("JERSEY"));
			repository.save(new Breed("LIMOUSINE"));
			repository.save(new Breed("BRADFORD"));
			repository.save(new Breed("CEBU"));
			repository.save(new Breed("BRAHMAN"));
			repository.save(new Breed("HOLANDO_ARGENTINA"));
			repository.save(new Breed("SANTA_GERTRUDIS"));
			repository.save(new Breed("SHORTHORN"));
		};
	}
}
