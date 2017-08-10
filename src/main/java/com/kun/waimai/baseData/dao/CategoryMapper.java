package com.kun.waimai.baseData.dao;

import com.kun.waimai.baseData.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CategoryMapper {
	
	/**
	 * 列表查询
	 * @param params 查询参数
	 * @return List<Category>
	 */
	List<Category> findList(Map<String, Object> params);
	
	/**
	 * 新增
	 * @param category
	 */
	void addOne(Category category);
	
	/**
	 * 根据ID删除
	 * @param id
	 */
	void delById(Integer id);
	
	/**
	 * 更新
 	 * @param category
	 */
	void updateOne(Category category);
	
	/**
	 * 根据ID查询
 	 * @param id
	 * @return Category
	 */
	 Category findById(Integer id);
}
