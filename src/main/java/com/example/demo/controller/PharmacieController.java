package com.example.demo.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Pharmacie;
import com.example.demo.entity.Photo;
import com.example.demo.entity.Zone;
import com.example.demo.repository.PharmicieRepository;
import com.example.demo.service.PharmacieService;


@RestController
@RequestMapping("Pharmacie")
@CrossOrigin
public class PharmacieController {
	
	@Autowired
	private PharmacieService pharmacieRepository;

	@PostMapping("/save")
	public void save(@RequestBody Pharmacie Garde) {
		pharmacieRepository.save(Garde);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Pharmacie s = pharmacieRepository.FindById(Integer.parseInt(id));
		pharmacieRepository.delete(s);
	}

	@GetMapping("/all")
	public List<Pharmacie> findAll() {
		return pharmacieRepository.findAll();
	}

	@GetMapping(value = "/count")
	public long countFiliere() {
		return pharmacieRepository.count();
	}


	
	@GetMapping("/ville/{villeNom}")
	public Collection<Pharmacie> getPharmaciesByVille(@PathVariable String villeNom) {
	    return pharmacieRepository.FindByVille(villeNom);
	}
	

	@GetMapping("/zone/{zoneNom}")
	public Collection<Pharmacie> getPharmaciesByZone(@PathVariable String zoneNom) {
	    return pharmacieRepository.findByZone(zoneNom);
	}

	
	@GetMapping("/v/{id}")
	public Pharmacie getPharmaciesById(@PathVariable String id) {
		Pharmacie s = pharmacieRepository.findById(Integer.parseInt(id));
		return s;
	}

  	
			@GetMapping("/{nome}/{address}")
			public Pharmacie getPharmacies(@PathVariable String nome,@PathVariable String address) {
			for(Pharmacie f : findAll()) {
				if((f.getNom() == null && nome == null || f.getNom() != null && f.getNom().equals(nome)) 
						   && (f.getAddress() == null && address == null || f.getAddress() != null && f.getAddress().equals(address))) {
						    return f;
						}
				
			}
			return null;
			}

}
