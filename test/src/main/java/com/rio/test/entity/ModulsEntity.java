package com.rio.test.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "MODULS")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "createAt", "updateAt", "recId"})
public class ModulsEntity extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5965431284934852505L;

	@Column(name = "MODULE_NAME", length = 255)
	private String moduleName;
	
	@Column(name = "MODULE_ORDER")
	private Integer moduleOrder;


	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "USER_PRIVILAGE", joinColumns = @JoinColumn(name = "MODUL_FK", referencedColumnName = "REC_ID"),
	inverseJoinColumns = @JoinColumn(name = "USER_GROUP_FK", referencedColumnName = "REC_ID"))
	@JsonIgnore
	private Set<UserGroupEntity> userGroup;


	public String getModuleName() {
		return moduleName;
	}


	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}


	public Integer getModuleOrder() {
		return moduleOrder;
	}


	public void setModuleOrder(Integer moduleOrder) {
		this.moduleOrder = moduleOrder;
	}


	public Set<UserGroupEntity> getUserGroup() {
		return userGroup;
	}


	public void setUserGroup(Set<UserGroupEntity> userGroup) {
		this.userGroup = userGroup;
	}
	
	
}
