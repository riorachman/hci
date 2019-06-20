package com.rio.test.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rio.test.entity.UsersEntity;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Long> {
	
	@Query("SELECT u FROM USERS u WHERE u.userId = :userId")
	Optional<UsersEntity> findByUserId(@Param("userId") String userId);
}
