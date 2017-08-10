package com.kun.waimai.baseData.dao;

import com.kun.waimai.baseData.entity.Store;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StoreMapper {
	
	/**
	 * 列表查询
	 * @param params 查询参数
	 * @return List<Store>
	 */
	List<Store> findList(Map<String, Object> params);
	
	/**
	 * 新增
	 * @param store
	 */
	void addOne(Store store);
	
	/**
	 * 根据ID删除
	 * @param id
	 */
	void delById(Integer id);
	
	/**
	 * 更新
 	 * @param store
	 */
	void updateOne(Store store);
	
	/**
	 * 根据ID查询
 	 * @param id
	 * @return Store
	 */
	 Store findById(Integer id);
}
