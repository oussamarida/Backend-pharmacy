package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Ville;
import com.example.demo.entity.Zone;
import com.example.demo.repository.VilleRepository;
import com.example.demo.repository.ZoneRepository;

@Service
public class ZoneService implements IDeo<Zone> {

	@Autowired	
	private ZoneRepository  zoneRepository;
	
	@Override
	public void save(Zone o) {
		zoneRepository.save(o);
		
	}

	@Override
	public void delete(Zone o) {
		zoneRepository.delete(o);
	}

	@Override
	public void update(Zone o) {
		zoneRepository.save(o);
	}

	@Override
	public Zone FindById(int id) {
		return zoneRepository.findById(id);
	}

	@Override
	public List<Zone> findAll() {
		return zoneRepository.findAll()
				;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}


}
