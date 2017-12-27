package com.kun.shop.baseData.dao;

import com.kun.shop.baseData.entity.StoreBulletin;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StoreBulletinMapper {
	
	/**
	 * 列表查询
	 * @param params 查询参数
	 * @return List<StoreBulletin>
	 */
	List<StoreBulletin> findList(Map<String, Object> params);
	
	/**
	 * 新增
	 * @param storeBulletin
	 */
	void addOne(StoreBulletin storeBulletin);
	
	/**
	 * 根据ID删除
	 * @param id
	 */
	void delById(Integer id);
	
	/**
	 * 更新
 	 * @param storeBulletin
	 */
	void updateOne(StoreBulletin storeBulletin);
	
	/**
	 * 根据ID查询
 	 * @param id
	 * @return StoreBulletin
	 */
	 StoreBulletin findById(Integer id);
}
