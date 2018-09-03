package com.turodeodemo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Breed {

	private @Id String name;

	public Breed() { }

	public Breed(String name) {
		this.name = name;
	}

}
