package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Garde;
import com.example.demo.entity.Photo;

@Component
public interface PhotoRepository extends JpaRepository<Photo, Integer> {
	Photo findById(int id);
	Photo findByNom(String nom);
}
