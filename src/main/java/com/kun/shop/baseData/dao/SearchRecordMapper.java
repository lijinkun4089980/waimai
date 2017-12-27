package com.kun.shop.baseData.dao;

import com.kun.shop.baseData.entity.SearchRecord;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SearchRecordMapper {
	
	/**
	 * 列表查询
	 * @param params 查询参数
	 * @return List<SearchRecord>
	 */
	List<SearchRecord> findList(Map<String, Object> params);
	
	/**
	 * 新增
	 * @param searchRecord
	 */
	void addOne(SearchRecord searchRecord);
	
	/**
	 * 根据ID删除
	 * @param id
	 */
	void delById(Integer id);
	
	/**
	 * 更新
 	 * @param searchRecord
	 */
	void updateOne(SearchRecord searchRecord);
	
	/**
	 * 根据ID查询
 	 * @param id
	 * @return SearchRecord
	 */
	 SearchRecord findById(Integer id);
}
