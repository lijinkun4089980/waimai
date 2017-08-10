package com.kun.waimai.baseData.entity;

import com.kun.waimai.base.common.IdEntity;

/**
 *
 * 公共图片表
 *
 */
public class PublicPicture extends IdEntity {

	/** 关联ID **/ 
	private Integer relationId;
	/** 图片类型（1：评价图片） **/ 
	private Integer pictureType;
	/** 图片地址 **/ 
	private String pictureUrl;
	
	/** 无参的构造函数 **/
	public PublicPicture(){
		super();
	}
	
	/** 有参构造函数 **/
	public PublicPicture(Integer relationId,Integer pictureType,String pictureUrl){
		super();
		this.relationId = relationId;
		this.pictureType = pictureType;
		this.pictureUrl = pictureUrl;
	}
 	
		
	/**
	 * @return 关联ID
	 */
	public Integer getRelationId() {
		return relationId;
	}
	/**
	 * @param relationId 关联ID
	 */
	public void setRelationId(Integer relationId) {
		this.relationId = relationId;
	}
		
	/**
	 * @return 图片类型（1：评价图片）
	 */
	public Integer getPictureType() {
		return pictureType;
	}
	/**
	 * @param pictureType 图片类型（1：评价图片）
	 */
	public void setPictureType(Integer pictureType) {
		this.pictureType = pictureType;
	}
		
	/**
	 * @return 图片地址
	 */
	public String getPictureUrl() {
		return pictureUrl;
	}
	/**
	 * @param pictureUrl 图片地址
	 */
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
 	
}
