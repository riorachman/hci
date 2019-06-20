package com.rio.test.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "USER_GROUP")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "createAt", "updateAt", "recId", "name"})
public class UserGroupEntity extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5641527204478191844L;

	@Column(name = "GROUP_NAME", length = 255, nullable = false)
	private String name;

	@ManyToMany(mappedBy = "userGroup")
	@OrderBy("moduleOrder ASC")
	@JsonIgnore
	private Set<ModulsEntity> modules = new HashSet<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<ModulsEntity> getModuls() {
		return modules;
	}

	public void setModuls(Set<ModulsEntity> modules) {
		this.modules = modules;
	}
	
}
