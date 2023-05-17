package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Role;
import com.example.demo.repository.RoleRepository;
import com.example.demo.service.RoleService;


@RestController
@RequestMapping("Role")
public class RoleController {

	
	@Autowired
	private RoleService rolerepository;

	@PostMapping("/save")
	public void save(@RequestBody Role role) {
		rolerepository.save(role);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Role s = rolerepository.FindById(Integer.parseInt(id));
		rolerepository.delete(s);
	}

	@GetMapping("/all")
	public List<Role> findAll() {
		return rolerepository.findAll();
	}

	@GetMapping(value = "/count")
	public long countFiliere() {
		return rolerepository.count();
	}
	
}
