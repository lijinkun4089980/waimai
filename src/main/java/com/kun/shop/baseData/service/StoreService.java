package com.kun.shop.baseData.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kun.shop.base.common.GlobalConfigure;
import com.kun.shop.baseData.dao.StoreMapper;
import com.kun.shop.baseData.entity.Store;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 
@Service
@Transactional(readOnly = true)
public class StoreService {
 	
 	@Resource
	private StoreMapper storeMapper;
 	
 	/**
 	 * 分页查询
	 * @param store
	 * @param pageNo 页码
	 */
 	public PageInfo<Store> queryByPage(Store store, Integer pageNo) {
 		PageHelper.startPage(pageNo, GlobalConfigure.DEFAULT_PAGE_SIZE);
 		Map<String,Object> parameter = new HashMap<String, Object>();
 		// TODO 查询参数
 		List<Store> list = storeMapper.findList(parameter);
 		PageInfo<Store> page = new PageInfo<Store>(list);
 		return page;
 	}
 	
 	/**
 	 * 新增
	 * @param store
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void addOne(Store store) {
 		if (store == null) {
 			throw new RuntimeException("要保存的对象为空,操作失败.");
 		}
 		this.storeMapper.addOne(store);
 	}
 	
 	/**
 	 * 修改
	 * @param store
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void updateOne(Store store) {
 		if (store == null) {
 			throw new RuntimeException("要修改的对象为空,操作失败.");
 		}
 		if (store.getId() == null) {
 			throw new RuntimeException("要修改的对象ID为空,操作失败.");
 		}
 		this.storeMapper.updateOne(store);
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
 		this.storeMapper.delById(id);
 	}
 	
 	/**
 	 * 根据ID查询
	 * @param id
	 * @return Store
	 */
 	public Store findById(Integer id) {
 		if (null == id) {
	 		throw new RuntimeException("缺少参数ID,操作失败.");
 		}
 		Store store = this.storeMapper.findById(id);
 		return store;
 	}
}
