package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Pharmacie;
import com.example.demo.entity.Photo;
import com.example.demo.entity.Role;
import com.example.demo.service.PhotoService;
import com.example.demo.service.RoleService;


@RestController
@RequestMapping("Photo")
@CrossOrigin
public class PhotoController {

	
	@Autowired
	private PhotoService photorepository;

	@PostMapping("/save")
	public void save(@RequestBody Photo photo) {
		photorepository.save(photo);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Photo s = photorepository.FindById(Integer.parseInt(id));
		photorepository.delete(s);
	}

	@GetMapping("/all")
	public List<Photo> findAll() {
		return photorepository.findAll();
	}

	@GetMapping(value = "/count")
	public long count() {
		return photorepository.count();
	}
	
	@GetMapping(value = "/findbyid")
	public long Findbyid() {
		return photorepository.count();
	}
	

	

	
	
}

