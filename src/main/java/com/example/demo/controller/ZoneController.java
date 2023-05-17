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
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Pharmacie;
import com.example.demo.entity.Zone;
import com.example.demo.repository.ZoneRepository;
import com.example.demo.service.ZoneService;


@RestController
@RequestMapping("Zone")
@CrossOrigin
public class ZoneController {
	
	@Autowired
	private ZoneService zonerepository;

	@PostMapping("/save")
	public void save(@RequestBody Zone zone) {
		zonerepository.save(zone);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Zone s = zonerepository.FindById(Integer.parseInt(id));
		zonerepository.delete(s);
	}

	@GetMapping("/all")
	public List<Zone> findAll() {
		return zonerepository.findAll();
	}

	@GetMapping(value = "/count")
	public long countFiliere() {
		return zonerepository.count();
	}


	
}
