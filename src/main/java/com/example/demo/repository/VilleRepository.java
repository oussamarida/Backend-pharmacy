package com.example.demo.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Pharmacie;
import com.example.demo.entity.Ville;
import com.example.demo.entity.Zone;



public interface VilleRepository extends JpaRepository<Ville, Integer> {
	Ville findById(int id);
	
	
	
	
	
	@Query("SELECT z FROM Ville v JOIN v.zone z  WHERE v.nom = :ville")
	 Collection<Zone> findByNom(@Param("ville") String ville);
	
	
	
	@Query("SELECT p FROM Ville v JOIN v.zone z JOIN z.pharmacie p  WHERE v.nom = :ville AND z.nom=:zone")
	 Collection<Pharmacie> findByNom2(@Param("ville") String ville, @Param("zone") String zone);
	

	@Query("SELECT p FROM Ville v JOIN v.zone z JOIN z.pharmacie p  WHERE v.nom = :ville ")
	 Collection<Pharmacie> findByNom4(@Param("ville") String ville);
	
	@Query("SELECT p FROM Ville v JOIN v.zone z JOIN z.pharmacie p JOIN p.gardepharmacie gp JOIN gp.garde g  WHERE g.nom=:garde AND v.nom = :ville AND z.nom=:zone")
	 Collection<Pharmacie> findByNom3(@Param("ville") String ville, @Param("zone") String zone, @Param("garde") String garde);
	
	
	
	//	@Query("SELECT p FROM Pharmacie p JOIN p.zone z  WHERE z.nom = :zoneNom")
	//	Collection<Pharmacie> findByZone(@Param("zoneNom") String zoneNom);
		
	 // @Query("SELECT v FROM Ville v JOIN v.zone z  WHERE v.nom = :villeNom")
	 //	Collection<Pharmacie> findByVille(@Param("villeNom") String villeNom);
		
}
