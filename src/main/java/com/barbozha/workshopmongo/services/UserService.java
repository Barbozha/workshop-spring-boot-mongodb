package com.barbozha.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barbozha.workshopmongo.domain.User;
import com.barbozha.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	public List<User> findAll() {
		return repository.findAll();
	}
}
