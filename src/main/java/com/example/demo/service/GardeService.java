package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Garde;
import com.example.demo.entity.Pharmacie;
import com.example.demo.repository.GardeRepository;
import com.example.demo.repository.PharmicieRepository;


@Service
public class GardeService  implements IDeo<Garde> {

	@Autowired	
	private GardeRepository  gardeRepository;
	
	@Override
	public void save(Garde o) {
		gardeRepository.save(o);
		
	}

	@Override
	public void delete(Garde o) {
		gardeRepository.delete(o);
	}

	@Override
	public void update(Garde o) {
		gardeRepository.save(o);
	}

	@Override
	public Garde FindById(int id) {
		return gardeRepository.findById(id);
	}

	@Override
	public List<Garde> findAll() {
		return gardeRepository.findAll()
				;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}



}
