package com.kun.waimai.baseData.entity;

import com.kun.waimai.base.common.IdEntity;

/**
 *
 * 角色用户中间表
 *
 */
public class RoleUser extends IdEntity {

	/** 角色ID **/ 
	private Integer roleId;
	
	/** 无参的构造函数 **/
	public RoleUser(){
		super();
	}
	
	/** 有参构造函数 **/
	public RoleUser(Integer roleId){
		super();
		this.roleId = roleId;
	}
 	
		
	/**
	 * @return 角色ID
	 */
	public Integer getRoleId() {
		return roleId;
	}
	/**
	 * @param roleId 角色ID
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
 	
}
