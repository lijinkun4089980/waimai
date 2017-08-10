package com.kun.waimai.baseData.entity;

import com.kun.waimai.base.common.IdEntity;

/**
 *
 * 门店公告表
 *
 */
public class StoreBulletin extends IdEntity {

	/** 门店ID **/ 
	private Integer storeId;
	/** 公告内容 **/ 
	private String bulletinContent;
	
	/** 无参的构造函数 **/
	public StoreBulletin(){
		super();
	}
	
	/** 有参构造函数 **/
	public StoreBulletin(Integer storeId,String bulletinContent){
		super();
		this.storeId = storeId;
		this.bulletinContent = bulletinContent;
	}
 	
		
	/**
	 * @return 门店ID
	 */
	public Integer getStoreId() {
		return storeId;
	}
	/**
	 * @param storeId 门店ID
	 */
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
		
	/**
	 * @return 公告内容
	 */
	public String getBulletinContent() {
		return bulletinContent;
	}
	/**
	 * @param bulletinContent 公告内容
	 */
	public void setBulletinContent(String bulletinContent) {
		this.bulletinContent = bulletinContent;
	}
 	
}
