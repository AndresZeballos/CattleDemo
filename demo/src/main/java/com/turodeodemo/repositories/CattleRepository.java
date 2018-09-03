package com.turodeodemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turodeodemo.models.Cattle;

public interface CattleRepository extends JpaRepository<Cattle, String> {

}
