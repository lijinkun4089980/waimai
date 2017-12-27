package com.kun.shop.baseData.dao;

import com.kun.shop.baseData.entity.CommonAddress;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;



@Repository
public interface CommonAddressMapper {
	
	/**
	 * 列表查询
	 * @param params 查询参数
	 * @return List<CommonAddress>
	 */
	List<CommonAddress> findList(Map<String, Object> params);
	
	/**
	 * 新增
	 * @param commonAddress
	 */
	void addOne(CommonAddress commonAddress);
	
	/**
	 * 根据ID删除
	 * @param id
	 */
	void delById(Integer id);
	
	/**
	 * 更新
 	 * @param commonAddress
	 */
	void updateOne(CommonAddress commonAddress);
	
	/**
	 * 根据ID查询
 	 * @param id
	 * @return CommonAddress
	 */
	 CommonAddress findById(Integer id);
}
