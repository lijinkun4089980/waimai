package com.kun.shop.baseData.dao;

import com.kun.shop.baseData.entity.MainOrderProcess;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface MainOrderProcessMapper {
	
	/**
	 * 列表查询
	 * @param params 查询参数
	 * @return List<MainOrderProcess>
	 */
	List<MainOrderProcess> findList(Map<String, Object> params);
	
	/**
	 * 新增
	 * @param mainOrderProcess
	 */
	void addOne(MainOrderProcess mainOrderProcess);
	
	/**
	 * 根据ID删除
	 * @param id
	 */
	void delById(Integer id);
	
	/**
	 * 更新
 	 * @param mainOrderProcess
	 */
	void updateOne(MainOrderProcess mainOrderProcess);
	
	/**
	 * 根据ID查询
 	 * @param id
	 * @return MainOrderProcess
	 */
	 MainOrderProcess findById(Integer id);
}
