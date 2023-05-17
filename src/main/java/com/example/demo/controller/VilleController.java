package com.example.demo.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Pharmacie;
import com.example.demo.entity.Ville;
import com.example.demo.entity.Zone;
import com.example.demo.repository.VilleRepository;
import com.example.demo.service.VilleService;
import com.fasterxml.jackson.annotation.JsonIgnore;

@RestController
@RequestMapping("Ville")
@CrossOrigin
public class VilleController {
	
	
	
	
	@Autowired
	private VilleService	 villeService;

	@PostMapping("/save")
	public void save(@RequestBody Ville ville) {
		villeService.save(ville);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Ville s = villeService.FindById(Integer.parseInt(id));
		villeService.delete(s);
	}

	@GetMapping("/all")
	public List<Ville> findAll() {
		return villeService.findAll();
	}

	@GetMapping(value = "/count")
	public long countFiliere() {
		return villeService.count();
	}
	
	
	@GetMapping("/v/{ville}")
	public Collection<Zone> getPharmaciesByZone(@PathVariable String ville) {
	    return villeService.findByNom(ville);
	}
	
	@GetMapping("/Phar/{ville}")
	public Collection<Pharmacie> getPharmaciesByVille(@PathVariable String ville) {
	    return villeService.findByNom4(ville);
	}
	
	@GetMapping("/v/{ville}/z/{zone}")
	public Collection<Pharmacie> getPharmaciesByZone(@PathVariable String ville,@PathVariable String zone) {
	    return villeService.findByNom2(ville,zone);
	}

	@GetMapping("/v/{ville}/z/{zone}/garde/garde={garde}")
	public Collection<Pharmacie> getPharmaciesByZone(@PathVariable String ville,@PathVariable String zone ,@PathVariable String garde) {
		if(garde=="") {
			 return villeService.findByNom2(ville,zone);
		}else {
			return villeService.findByNom3(ville,zone,garde);
		}
	  
	}
	
	
	
}
