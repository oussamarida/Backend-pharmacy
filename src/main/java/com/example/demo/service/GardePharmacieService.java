package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Gardepharmacie;
import com.example.demo.entity.Pharmacie;
import com.example.demo.repository.GardepharmacieRepository;
import com.example.demo.repository.PharmicieRepository;


@Service
public class GardePharmacieService   implements IDeo<Gardepharmacie> {

	@Autowired	
	private GardepharmacieRepository  gardepharmacieRepository;
	
	@Override
	public void save(Gardepharmacie o) {
		gardepharmacieRepository.save(o);
		
	}

	@Override
	public void delete(Gardepharmacie o) {
		gardepharmacieRepository.delete(o);
	}

	@Override
	public void update(Gardepharmacie o) {
		gardepharmacieRepository.save(o);
	}

	@Override
	public Gardepharmacie FindById(int id) {
		return gardepharmacieRepository.findById(id);
	}

	@Override
	public List<Gardepharmacie> findAll() {
		return gardepharmacieRepository.findAll()
				;
	}

}
