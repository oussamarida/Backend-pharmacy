package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Garde;


public interface GardeRepository extends JpaRepository<Garde, Integer> {
	Garde findById(int id);
}
