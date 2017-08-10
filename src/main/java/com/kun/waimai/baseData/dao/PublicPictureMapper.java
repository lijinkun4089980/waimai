package com.kun.waimai.baseData.dao;

import com.kun.waimai.baseData.entity.PublicPicture;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PublicPictureMapper {
	
	/**
	 * 列表查询
	 * @param params 查询参数
	 * @return List<PublicPicture>
	 */
	List<PublicPicture> findList(Map<String, Object> params);
	
	/**
	 * 新增
	 * @param publicPicture
	 */
	void addOne(PublicPicture publicPicture);
	
	/**
	 * 根据ID删除
	 * @param id
	 */
	void delById(Integer id);
	
	/**
	 * 更新
 	 * @param publicPicture
	 */
	void updateOne(PublicPicture publicPicture);
	
	/**
	 * 根据ID查询
 	 * @param id
	 * @return PublicPicture
	 */
	 PublicPicture findById(Integer id);
}
