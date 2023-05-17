package com.example.demo.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Pharmacie;
import com.example.demo.entity.Zone;

public interface PharmicieRepository extends JpaRepository<Pharmacie, Integer> {

	
	Pharmacie findById(int id);
	Pharmacie findByNom(String nom);
	

	
	
	@Query(" SELECT p FROM Pharmacie p JOIN p.zone z JOIN z.ville v WHERE v.nom = :villeNom")
	Collection<Pharmacie> findByVille(@Param("villeNom") String villeNom);
	
	
	@Query(" SELECT p FROM Pharmacie p JOIN p.zone z  WHERE z.nom = :zoneNom")
	Collection<Pharmacie> findByZone(@Param("zoneNom") String zoneNom);
	
	
	@Query(" SELECT p FROM Pharmacie p JOIN p.zone z  WHERE z.nom = :zoneNom")
	Collection<Pharmacie> findByNom3(@Param("zoneNom") String zoneNom);
	


	//SELECT p FROM Pharmacie p JOIN p.zone z WHERE z.id = 1  SELECT p FROM Pharmacie p JOIN p.zone z JOIN z.ville v WHERE v.nom = :villeNom
	//@Query("SELECT p FROM Pharmacie p , Zone z , ville v WHERE v.id=z.ville_id AND p.zone_id=z.id AND v.nom= :villeNom")
//	Collection<Pharmacie> findByVille(@Param("villeNom") String villeNom);
}
