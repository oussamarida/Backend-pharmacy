package com.example.demo.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Pharmacie;
import com.example.demo.entity.Ville;
import com.example.demo.entity.Zone;
import com.example.demo.repository.VilleRepository;

@Service
public class VilleService implements IDeo<Ville> {

	@Autowired	
	private VilleRepository  villeRepository;
	
	@Override
	public void save(Ville o) {
		villeRepository.save(o);
		
	}

	@Override
	public void delete(Ville o) {
		villeRepository.delete(o);
	}

	@Override
	public void update(Ville o) {
		villeRepository.save(o);
	}

	@Override
	public Ville FindById(int id) {
		return villeRepository.findById(id);
	}

	@Override
	public List<Ville> findAll() {
		return villeRepository.findAll()
				;
	}

	public Collection<Zone> findByNom(String ville) {
		// TODO Auto-generated method stub
		return villeRepository.findByNom(ville)
				;
	}

	public Collection<Pharmacie> findByNom3(String ville, String zone, String periode) {
		// TODO Auto-generated method stub
		return villeRepository.findByNom3(ville, zone, periode);
	}

	public Collection<Pharmacie> findByNom2(String ville, String zone) {
	
		return villeRepository.findByNom2(ville, zone);
	}

	public Collection<Pharmacie> findByNom4(String ville) {
	
		return villeRepository.findByNom4(ville);
	}

	public long count() {
		return 0;
	}

}
