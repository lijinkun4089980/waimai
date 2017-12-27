package com.kun.shop.baseData.dao;

import com.kun.shop.baseData.entity.Evaluate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;



@Repository
public interface EvaluateMapper {
	
	/**
	 * 列表查询
	 * @param params 查询参数
	 * @return List<Evaluate>
	 */
	List<Evaluate> findList(Map<String, Object> params);
	
	/**
	 * 新增
	 * @param evaluate
	 */
	void addOne(Evaluate evaluate);
	
	/**
	 * 根据ID删除
	 * @param id
	 */
	void delById(Integer id);
	
	/**
	 * 更新
 	 * @param evaluate
	 */
	void updateOne(Evaluate evaluate);
	
	/**
	 * 根据ID查询
 	 * @param id
	 * @return Evaluate
	 */
	 Evaluate findById(Integer id);
}
