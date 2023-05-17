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
import com.example.demo.entity.User;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;



@RestController
@RequestMapping("User")
public class UserController {

	
	@Autowired
	private UserService userrepository;

	@PostMapping("/save")
	public void save(@RequestBody User user) {
		userrepository.save(user);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		User s = userrepository.FindById(Integer.parseInt(id));
		userrepository.delete(s);
	}

	@GetMapping("/all")
	public List<User> findAll() {
		return userrepository.findAll();
	}

	@GetMapping(value = "/count")
	public long countFiliere() {
		return userrepository.count();
	}
}
