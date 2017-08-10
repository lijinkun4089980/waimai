package com.kun.waimai.baseData.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kun.waimai.base.common.GlobalConfigure;
import com.kun.waimai.baseData.dao.StoreItemGoodsMapper;
import com.kun.waimai.baseData.entity.StoreItemGoods;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 
@Service
@Transactional(readOnly = true)
public class StoreItemGoodsService {
 	
 	@Resource
	private StoreItemGoodsMapper storeItemGoodsMapper;
 	
 	/**
 	 * 分页查询
	 * @param storeItemGoods
	 * @param pageNo 页码
	 */
 	public PageInfo<StoreItemGoods> queryByPage(StoreItemGoods storeItemGoods, Integer pageNo) {
 		PageHelper.startPage(pageNo, GlobalConfigure.DEFAULT_PAGE_SIZE);
 		Map<String,Object> parameter = new HashMap<String, Object>();
 		// TODO 查询参数
 		List<StoreItemGoods> list = storeItemGoodsMapper.findList(parameter);
 		PageInfo<StoreItemGoods> page = new PageInfo<StoreItemGoods>(list);
 		return page;
 	}
 	
 	/**
 	 * 新增
	 * @param storeItemGoods
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void addOne(StoreItemGoods storeItemGoods) {
 		if (storeItemGoods == null) {
 			throw new RuntimeException("要保存的对象为空,操作失败.");
 		}
 		this.storeItemGoodsMapper.addOne(storeItemGoods);
 	}
 	
 	/**
 	 * 修改
	 * @param storeItemGoods
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void updateOne(StoreItemGoods storeItemGoods) {
 		if (storeItemGoods == null) {
 			throw new RuntimeException("要修改的对象为空,操作失败.");
 		}
 		if (storeItemGoods.getId() == null) {
 			throw new RuntimeException("要修改的对象ID为空,操作失败.");
 		}
 		this.storeItemGoodsMapper.updateOne(storeItemGoods);
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
 		this.storeItemGoodsMapper.delById(id);
 	}
 	
 	/**
 	 * 根据ID查询
	 * @param id
	 * @return StoreItemGoods
	 */
 	public StoreItemGoods findById(Integer id) {
 		if (null == id) {
	 		throw new RuntimeException("缺少参数ID,操作失败.");
 		}
 		StoreItemGoods storeItemGoods = this.storeItemGoodsMapper.findById(id);
 		return storeItemGoods;
 	}
}
