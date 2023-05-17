package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Garde;
import com.example.demo.entity.Pharmacie;
import com.example.demo.entity.Photo;
import com.example.demo.repository.GardeRepository;
import com.example.demo.repository.PharmicieRepository;
import com.example.demo.repository.PhotoRepository;


@Service
public class PhotoService  implements IDeo<Photo> {

	@Autowired	
	private PhotoRepository  photoRepository;
	private PharmicieRepository  pharmacieRepository;
	
	@Override
	public void save(Photo o) {
		photoRepository.save(o);
		
	}

	@Override
	public void delete(Photo o) {
		photoRepository.delete(o);
	}

	@Override
	public void update(Photo o) {
		photoRepository.save(o);
	}

	@Override
	public Photo FindById(int id) {
		return photoRepository.findById(id);
	}

	@Override
	public List<Photo> findAll() {
		return photoRepository.findAll()
				;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Photo findByNom(String id) {
		return photoRepository.findByNom(id);
	}
	

}
