package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Gardepharmacie;

public interface GardepharmacieRepository extends JpaRepository<Gardepharmacie, Integer> {
	Gardepharmacie findById(int id);
}

