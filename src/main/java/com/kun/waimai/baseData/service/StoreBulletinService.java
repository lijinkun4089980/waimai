package com.kun.waimai.baseData.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kun.waimai.base.common.GlobalConfigure;
import com.kun.waimai.baseData.dao.StoreBulletinMapper;
import com.kun.waimai.baseData.entity.StoreBulletin;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 
@Service
@Transactional(readOnly = true)
public class StoreBulletinService {
 	
 	@Resource
	private StoreBulletinMapper storeBulletinMapper;
 	
 	/**
 	 * 分页查询
	 * @param storeBulletin
	 * @param pageNo 页码
	 */
 	public PageInfo<StoreBulletin> queryByPage(StoreBulletin storeBulletin, Integer pageNo) {
 		PageHelper.startPage(pageNo, GlobalConfigure.DEFAULT_PAGE_SIZE);
 		Map<String,Object> parameter = new HashMap<String, Object>();
 		// TODO 查询参数
 		List<StoreBulletin> list = storeBulletinMapper.findList(parameter);
 		PageInfo<StoreBulletin> page = new PageInfo<StoreBulletin>(list);
 		return page;
 	}
 	
 	/**
 	 * 新增
	 * @param storeBulletin
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void addOne(StoreBulletin storeBulletin) {
 		if (storeBulletin == null) {
 			throw new RuntimeException("要保存的对象为空,操作失败.");
 		}
 		this.storeBulletinMapper.addOne(storeBulletin);
 	}
 	
 	/**
 	 * 修改
	 * @param storeBulletin
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void updateOne(StoreBulletin storeBulletin) {
 		if (storeBulletin == null) {
 			throw new RuntimeException("要修改的对象为空,操作失败.");
 		}
 		if (storeBulletin.getId() == null) {
 			throw new RuntimeException("要修改的对象ID为空,操作失败.");
 		}
 		this.storeBulletinMapper.updateOne(storeBulletin);
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
 		this.storeBulletinMapper.delById(id);
 	}
 	
 	/**
 	 * 根据ID查询
	 * @param id
	 * @return StoreBulletin
	 */
 	public StoreBulletin findById(Integer id) {
 		if (null == id) {
	 		throw new RuntimeException("缺少参数ID,操作失败.");
 		}
 		StoreBulletin storeBulletin = this.storeBulletinMapper.findById(id);
 		return storeBulletin;
 	}
}
