package com.rio.test.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rio.test.entity.UserGroupEntity;
import com.rio.test.repository.UserGroupRepository;

@Component
public class UserGroupService {
	
	@Autowired
	private UserGroupRepository userGroupRepository;
	
	public Optional<UserGroupEntity> findPrivilageByGroupId(final Long id) {
		Optional<UserGroupEntity> userGroup = userGroupRepository.findById(id);
		return userGroup != null ? userGroup : Optional.empty();
	}
}
