package com.rio.test.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "USERS")
@Table(name = "USERS")
//@JsonIgnoreProperties(value = { "createAt", "updateAt" }, allowGetters = true)
public class UsersEntity extends BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7170339934587641481L;
	
	@Column(name = "USER_ID", nullable = false, unique = true)
	private String userId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_GROUP_FK")
	private UserGroupEntity userGroup;
	
	@Column(name = "NAME", length = 255)
	private String name;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public UserGroupEntity getUserGroup() {
		return userGroup;
	}

	public void setUserGroup(UserGroupEntity userGroup) {
		this.userGroup = userGroup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
