package com.rio.test.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rio.test.entity.ModulsEntity;
import com.rio.test.repository.ModulsRepository;

@Component
public class ModulsService {
	
	@Autowired
	private ModulsRepository modulsRepository;
	
	public Optional<ModulsEntity> findModulsById(final Long id) {
		Optional<ModulsEntity> moduls = modulsRepository.findById(id);
		return moduls != null ? moduls : Optional.empty();
	}

}
