package com.kun.waimai.baseData.dao;

import com.kun.waimai.baseData.entity.EvaluateTags;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface EvaluateTagsMapper {
	
	/**
	 * 列表查询
	 * @param params 查询参数
	 * @return List<EvaluateTags>
	 */
	List<EvaluateTags> findList(Map<String, Object> params);
	
	/**
	 * 新增
	 * @param evaluateTags
	 */
	void addOne(EvaluateTags evaluateTags);
	
	/**
	 * 根据ID删除
	 * @param id
	 */
	void delById(Integer id);
	
	/**
	 * 更新
 	 * @param evaluateTags
	 */
	void updateOne(EvaluateTags evaluateTags);
	
	/**
	 * 根据ID查询
 	 * @param id
	 * @return EvaluateTags
	 */
	 EvaluateTags findById(Integer id);
}
