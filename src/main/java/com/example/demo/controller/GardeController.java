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
import com.example.demo.repository.GardeRepository;
import com.example.demo.service.GardeService;


@RestController
@CrossOrigin
@RequestMapping("Garde")
public class GardeController {
	@Autowired
	private GardeService garderepository;

	@PostMapping("/save")
	public void save(@RequestBody Garde Garde) {
		garderepository.save(Garde);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Garde s = garderepository.FindById(Integer.parseInt(id));
		garderepository.delete(s);
	}

	@GetMapping("/all")
	public List<Garde> findAll() {
		return garderepository.findAll();
	}

	@GetMapping(value = "/count")
	public long countFiliere() {
		return garderepository.count();
	}


}
