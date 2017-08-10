package com.kun.waimai.baseData.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kun.waimai.base.common.GlobalConfigure;
import com.kun.waimai.baseData.dao.PermissionMapper;
import com.kun.waimai.baseData.entity.Permission;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 
@Service
@Transactional(readOnly = true)
public class PermissionService {
 	
 	@Resource
	private PermissionMapper permissionMapper;
 	
 	/**
 	 * 分页查询
	 * @param permission
	 * @param pageNo 页码
	 */
 	public PageInfo<Permission> queryByPage(Permission permission, Integer pageNo) {
 		PageHelper.startPage(pageNo, GlobalConfigure.DEFAULT_PAGE_SIZE);
 		Map<String,Object> parameter = new HashMap<String, Object>();
 		// TODO 查询参数
 		List<Permission> list = permissionMapper.findList(parameter);
 		PageInfo<Permission> page = new PageInfo<Permission>(list);
 		return page;
 	}
 	
 	/**
 	 * 新增
	 * @param permission
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void addOne(Permission permission) {
 		if (permission == null) {
 			throw new RuntimeException("要保存的对象为空,操作失败.");
 		}
 		this.permissionMapper.addOne(permission);
 	}
 	
 	/**
 	 * 修改
	 * @param permission
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void updateOne(Permission permission) {
 		if (permission == null) {
 			throw new RuntimeException("要修改的对象为空,操作失败.");
 		}
 		if (permission.getId() == null) {
 			throw new RuntimeException("要修改的对象ID为空,操作失败.");
 		}
 		this.permissionMapper.updateOne(permission);
 	}
 	
 	/**
 	 * 根据ID删除
	 * @param id
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void delById(Integer id) {
 		if (null == id) {
 			throw new RuntimeException("缺少参数ID,操作失败.");
 		}
 		this.permissionMapper.delById(id);
 	}
 	
 	/**
 	 * 根据ID查询
	 * @param id
	 * @return Permission
	 */
 	public Permission findById(Integer id) {
 		if (null == id) {
	 		throw new RuntimeException("缺少参数ID,操作失败.");
 		}
 		Permission permission = this.permissionMapper.findById(id);
 		return permission;
 	}
}
