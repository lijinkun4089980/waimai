package com.kun.waimai.baseData.dao;

import com.kun.waimai.baseData.entity.ItemOrder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ItemOrderMapper {
	
	/**
	 * 列表查询
	 * @param params 查询参数
	 * @return List<ItemOrder>
	 */
	List<ItemOrder> findList(Map<String, Object> params);
	
	/**
	 * 新增
	 * @param itemOrder
	 */
	void addOne(ItemOrder itemOrder);
	
	/**
	 * 根据ID删除
	 * @param id
	 */
	void delById(Integer id);
	
	/**
	 * 更新
 	 * @param itemOrder
	 */
	void updateOne(ItemOrder itemOrder);
	
	/**
	 * 根据ID查询
 	 * @param id
	 * @return ItemOrder
	 */
	 ItemOrder findById(Integer id);
}
