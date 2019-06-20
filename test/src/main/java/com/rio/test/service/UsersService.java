package com.rio.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rio.test.entity.UsersEntity;
import com.rio.test.exception.ResourceNotFoundException;
import com.rio.test.repository.UsersRepository;

@Component
public class UsersService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	public List<UsersEntity> getUsers() {
		return (List<UsersEntity>) usersRepository.findAll();
	}
	
	public UsersEntity getUserByUserId(final String userId) {
		Optional<UsersEntity> optionalUser = usersRepository.findByUserId(userId);
		
		return optionalUser.orElseThrow(() -> new ResourceNotFoundException());
	}

}
