package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Role;
import com.example.demo.entity.Ville;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.VilleRepository;

@Service
public class RoleService implements IDeo<Role> {

	@Autowired	
	private RoleRepository  zoneRepository;
	
	@Override
	public void save(Role o) {
		zoneRepository.save(o);
		
	}

	@Override
	public void delete(Role o) {
		zoneRepository.delete(o);
	}

	@Override
	public void update(Role o) {
		zoneRepository.save(o);
	}

	@Override
	public Role FindById(int id) {
		return zoneRepository.findById(id);
	}

	@Override
	public List<Role> findAll() {
		return zoneRepository.findAll()
				;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

}