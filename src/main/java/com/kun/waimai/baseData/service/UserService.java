package com.kun.waimai.baseData.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kun.waimai.base.common.GlobalConfigure;
import com.kun.waimai.baseData.dao.UserMapper;
import com.kun.waimai.baseData.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 
@Service
@Transactional(readOnly = true)
public class UserService {
 	
 	@Resource
	private UserMapper userMapper;
 	
 	/**
 	 * 分页查询
	 * @param user
	 * @param pageNo 页码
	 */
 	public PageInfo<User> queryByPage(User user, Integer pageNo) {
 		PageHelper.startPage(pageNo, GlobalConfigure.DEFAULT_PAGE_SIZE);
 		Map<String,Object> parameter = new HashMap<String, Object>();
 		// TODO 查询参数
 		List<User> list = userMapper.findList(parameter);
 		PageInfo<User> page = new PageInfo<User>(list);
 		return page;
 	}
 	
 	/**
 	 * 新增
	 * @param user
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void addOne(User user) {
 		if (user == null) {
 			throw new RuntimeException("要保存的对象为空,操作失败.");
 		}
 		this.userMapper.addOne(user);
 	}
 	
 	/**
 	 * 修改
	 * @param user
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void updateOne(User user) {
 		if (user == null) {
 			throw new RuntimeException("要修改的对象为空,操作失败.");
 		}
 		if (user.getId() == null) {
 			throw new RuntimeException("要修改的对象ID为空,操作失败.");
 		}
 		this.userMapper.updateOne(user);
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
 		this.userMapper.delById(id);
 	}
 	
 	/**
 	 * 根据ID查询
	 * @param id
	 * @return User
	 */
 	public User findById(Integer id) {
 		if (null == id) {
	 		throw new RuntimeException("缺少参数ID,操作失败.");
 		}
 		User user = this.userMapper.findById(id);
 		return user;
 	}
}
