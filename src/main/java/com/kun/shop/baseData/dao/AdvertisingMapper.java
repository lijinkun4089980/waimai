package com.kun.shop.baseData.dao;

import com.kun.shop.baseData.entity.Advertising;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface AdvertisingMapper {
	
	/**
	 * 列表查询
	 * @param params 查询参数
	 * @return List<Advertising>
	 */
	List<Advertising> findList(Map<String, Object> params);
	
	/**
	 * 新增
	 * @param advertising
	 */
	void addOne(Advertising advertising);
	
	/**
	 * 根据ID删除
	 * @param id
	 */
	void delById(Integer id);
	
	/**
	 * 更新
 	 * @param advertising
	 */
	void updateOne(Advertising advertising);
	
	/**
	 * 根据ID查询
 	 * @param id
	 * @return Advertising
	 */
	 Advertising findById(Integer id);
}
