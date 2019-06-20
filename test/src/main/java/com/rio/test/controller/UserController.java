package com.rio.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rio.test.entity.UserGroupEntity;
import com.rio.test.entity.UsersEntity;
import com.rio.test.service.UserGroupService;
import com.rio.test.service.UsersService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UsersService usersService;
	
	@Autowired
	private UserGroupService userGroupService;
	
	@GetMapping
	public List<UsersEntity> getUsers() {
		return usersService.getUsers();
	}
	
	@GetMapping(path = "/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getModuleByUser(@PathVariable String userId) {
		UsersEntity users = usersService.getUserByUserId(userId);
		
		Optional<UserGroupEntity> userGroup = userGroupService.findPrivilageByGroupId(users.getUserGroup().getRecId());
		
		return new ResponseEntity<Object>(userGroup, HttpStatus.OK);
	}
	
}
