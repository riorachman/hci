package com.rio.test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2643805355419121796L;

	public ResourceNotFoundException() {
	}

	public ResourceNotFoundException(String entity, Long id) {
		super(entity + " id " + id + " not found");
	}
}
