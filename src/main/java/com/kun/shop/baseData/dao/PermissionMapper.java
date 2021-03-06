package com.kun.shop.baseData.dao;

import com.kun.shop.baseData.entity.Permission;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PermissionMapper {
	
	/**
	 * 列表查询
	 * @param params 查询参数
	 * @return List<Permission>
	 */
	List<Permission> findList(Map<String, Object> params);
	
	/**
	 * 新增
	 * @param permission
	 */
	void addOne(Permission permission);
	
	/**
	 * 根据ID删除
	 * @param id
	 */
	void delById(Integer id);
	
	/**
	 * 更新
 	 * @param permission
	 */
	void updateOne(Permission permission);
	
	/**
	 * 根据ID查询
 	 * @param id
	 * @return Permission
	 */
	 Permission findById(Integer id);
}
