package com.kun.shop.baseData.dao;

import com.kun.shop.baseData.entity.MainOrder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface MainOrderMapper {
	
	/**
	 * 列表查询
	 * @param params 查询参数
	 * @return List<MainOrder>
	 */
	List<MainOrder> findList(Map<String, Object> params);
	
	/**
	 * 新增
	 * @param mainOrder
	 */
	void addOne(MainOrder mainOrder);
	
	/**
	 * 根据ID删除
	 * @param id
	 */
	void delById(Integer id);
	
	/**
	 * 更新
 	 * @param mainOrder
	 */
	void updateOne(MainOrder mainOrder);
	
	/**
	 * 根据ID查询
 	 * @param id
	 * @return MainOrder
	 */
	 MainOrder findById(Integer id);
}
