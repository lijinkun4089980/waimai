package com.kun.waimai.baseData.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kun.waimai.base.common.GlobalConfigure;
import com.kun.waimai.baseData.dao.StoreMainGoodsMapper;
import com.kun.waimai.baseData.entity.StoreMainGoods;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 
@Service
@Transactional(readOnly = true)
public class StoreMainGoodsService {
 	
 	@Resource
	private StoreMainGoodsMapper storeMainGoodsMapper;
 	
 	/**
 	 * 分页查询
	 * @param storeMainGoods
	 * @param pageNo 页码
	 */
 	public PageInfo<StoreMainGoods> queryByPage(StoreMainGoods storeMainGoods, Integer pageNo) {
 		PageHelper.startPage(pageNo, GlobalConfigure.DEFAULT_PAGE_SIZE);
 		Map<String,Object> parameter = new HashMap<String, Object>();
 		// TODO 查询参数
 		List<StoreMainGoods> list = storeMainGoodsMapper.findList(parameter);
 		PageInfo<StoreMainGoods> page = new PageInfo<StoreMainGoods>(list);
 		return page;
 	}
 	
 	/**
 	 * 新增
	 * @param storeMainGoods
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void addOne(StoreMainGoods storeMainGoods) {
 		if (storeMainGoods == null) {
 			throw new RuntimeException("要保存的对象为空,操作失败.");
 		}
 		this.storeMainGoodsMapper.addOne(storeMainGoods);
 	}
 	
 	/**
 	 * 修改
	 * @param storeMainGoods
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void updateOne(StoreMainGoods storeMainGoods) {
 		if (storeMainGoods == null) {
 			throw new RuntimeException("要修改的对象为空,操作失败.");
 		}
 		if (storeMainGoods.getId() == null) {
 			throw new RuntimeException("要修改的对象ID为空,操作失败.");
 		}
 		this.storeMainGoodsMapper.updateOne(storeMainGoods);
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
 		this.storeMainGoodsMapper.delById(id);
 	}
 	
 	/**
 	 * 根据ID查询
	 * @param id
	 * @return StoreMainGoods
	 */
 	public StoreMainGoods findById(Integer id) {
 		if (null == id) {
	 		throw new RuntimeException("缺少参数ID,操作失败.");
 		}
 		StoreMainGoods storeMainGoods = this.storeMainGoodsMapper.findById(id);
 		return storeMainGoods;
 	}
}
