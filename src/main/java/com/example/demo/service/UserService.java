package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.entity.Ville;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.VilleRepository;

@Service
public class UserService  implements IDeo<User> {

	@Autowired	
	private UserRepository  userRepository;
	
	@Override
	public void save(User o) {
		userRepository.save(o);
		
	}

	@Override
	public void delete(User o) {
		userRepository.delete(o);
	}

	@Override
	public void update(User o) {
		userRepository.save(o);
	}

	@Override
	public User FindById(int id) {
		return userRepository.findById(id);
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll()
				;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
