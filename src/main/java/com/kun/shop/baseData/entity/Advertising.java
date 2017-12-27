package com.kun.shop.baseData.entity;

import com.kun.shop.base.common.IdEntity;


/**
 *
 * 广告位：上方图片及连接
 *
 */
public class Advertising extends IdEntity {

	/** 图片位置 **/ 
	private String pictureLocation;
	/** 图片URL **/ 
	private String pictureUrl;
	/** 备注 **/ 
	private String remark;
	
	/** 无参的构造函数 **/
	public Advertising(){
		super();
	}
	
	/** 有参构造函数 **/
	public Advertising(String pictureLocation,String pictureUrl,String remark){
		super();
		this.pictureLocation = pictureLocation;
		this.pictureUrl = pictureUrl;
		this.remark = remark;
	}
 	
		
	/**
	 * @return 图片位置
	 */
	public String getPictureLocation() {
		return pictureLocation;
	}
	/**
	 * @param pictureLocation 图片位置
	 */
	public void setPictureLocation(String pictureLocation) {
		this.pictureLocation = pictureLocation;
	}
		
	/**
	 * @return 图片URL
	 */
	public String getPictureUrl() {
		return pictureUrl;
	}
	/**
	 * @param pictureUrl 图片URL
	 */
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
		
	/**
	 * @return 备注
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark 备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
 	
}
