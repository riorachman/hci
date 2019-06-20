package com.rio.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rio.test.entity.UserGroupEntity;

public interface UserGroupRepository extends JpaRepository<UserGroupEntity, Long> {
	
}
