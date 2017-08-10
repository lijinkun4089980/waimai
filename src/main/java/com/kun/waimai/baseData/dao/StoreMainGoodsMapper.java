package com.kun.waimai.baseData.dao;

import com.kun.waimai.baseData.entity.StoreMainGoods;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StoreMainGoodsMapper {
	
	/**
	 * 列表查询
	 * @param params 查询参数
	 * @return List<StoreMainGoods>
	 */
	List<StoreMainGoods> findList(Map<String, Object> params);
	
	/**
	 * 新增
	 * @param storeMainGoods
	 */
	void addOne(StoreMainGoods storeMainGoods);
	
	/**
	 * 根据ID删除
	 * @param id
	 */
	void delById(Integer id);
	
	/**
	 * 更新
 	 * @param storeMainGoods
	 */
	void updateOne(StoreMainGoods storeMainGoods);
	
	/**
	 * 根据ID查询
 	 * @param id
	 * @return StoreMainGoods
	 */
	 StoreMainGoods findById(Integer id);
}
