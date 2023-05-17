package com.example.demo.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Gardepharmacie;
import com.example.demo.entity.Pharmacie;
import com.example.demo.entity.Photo;
import com.example.demo.repository.PharmicieRepository;
import com.example.demo.repository.UserRepository;


@Service
public class PharmacieService implements IDeo<Pharmacie> {

	@Autowired	
	private PharmicieRepository  pharmacieRepository;
	
	@Override
	public void save(Pharmacie o) {
		pharmacieRepository.save(o);
		
	}

	@Override
	public void delete(Pharmacie o) {
		pharmacieRepository.delete(o);
	}

	@Override
	public void update(Pharmacie o) {
		pharmacieRepository.save(o);
	}

	@Override
	public Pharmacie FindById(int id) {
		return pharmacieRepository.findById(id);
	}

	@Override
	public List<Pharmacie> findAll() {
		return pharmacieRepository.findAll()
				;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Collection<Pharmacie> FindByVille(String villeNom) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Pharmacie> findByZone(String zoneNom) {
		// TODO Auto-generated method stub
		return null;
	}

	public Pharmacie findById(int parseInt) {
		// TODO Auto-generated method stub
		return null;
	}
	

	

}
