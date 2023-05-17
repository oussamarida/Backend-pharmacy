package com.example.demo.controller;

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

import com.example.demo.entity.Garde;
import com.example.demo.entity.Gardepharmacie;
import com.example.demo.repository.GardeRepository;
import com.example.demo.repository.GardepharmacieRepository;


@RestController
@RequestMapping("Gardepharmacie")
@CrossOrigin
public class GardePharmacieController {

	
	@Autowired
	private GardepharmacieRepository GardePharmacierepository;

	@PostMapping("/save")
	public void save(@RequestBody Gardepharmacie gardePharmacie) {
		GardePharmacierepository.save(gardePharmacie);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Gardepharmacie s = GardePharmacierepository.findById(Integer.parseInt(id));
		GardePharmacierepository.delete(s);
	}

	@GetMapping("/all")
	public List<Gardepharmacie> findAll() {
		return GardePharmacierepository.findAll();
	}

	@GetMapping(value = "/count")
	public long countFiliere() {
		return GardePharmacierepository.count();
	}

}
