package com.kun.shop.baseData.dao;

import com.kun.shop.baseData.entity.StoreItemGoods;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StoreItemGoodsMapper {
	
	/**
	 * 列表查询
	 * @param params 查询参数
	 * @return List<StoreItemGoods>
	 */
	List<StoreItemGoods> findList(Map<String, Object> params);
	
	/**
	 * 新增
	 * @param storeItemGoods
	 */
	void addOne(StoreItemGoods storeItemGoods);
	
	/**
	 * 根据ID删除
	 * @param id
	 */
	void delById(Integer id);
	
	/**
	 * 更新
 	 * @param storeItemGoods
	 */
	void updateOne(StoreItemGoods storeItemGoods);
	
	/**
	 * 根据ID查询
 	 * @param id
	 * @return StoreItemGoods
	 */
	 StoreItemGoods findById(Integer id);
}
