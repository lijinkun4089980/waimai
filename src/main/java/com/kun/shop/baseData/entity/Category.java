package com.kun.shop.baseData.entity;

import com.kun.shop.base.common.IdEntity;

/**
 *
 * 分类主表
 *
 */
public class Category extends IdEntity {

	/** 类别名称 **/ 
	private String categoryName;
	/** 类别图标地址 **/ 
	private String categoryPictureLocation;
	/** 备注 **/ 
	private String remark;
	
	/** 无参的构造函数 **/
	public Category(){
		super();
	}
	
	/** 有参构造函数 **/
	public Category(String categoryName,String categoryPictureLocation,String remark){
		super();
		this.categoryName = categoryName;
		this.categoryPictureLocation = categoryPictureLocation;
		this.remark = remark;
	}
 	
		
	/**
	 * @return 类别名称
	 */
	public String getCategoryName() {
		return categoryName;
	}
	/**
	 * @param categoryName 类别名称
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
		
	/**
	 * @return 类别图标地址
	 */
	public String getCategoryPictureLocation() {
		return categoryPictureLocation;
	}
	/**
	 * @param categoryPictureLocation 类别图标地址
	 */
	public void setCategoryPictureLocation(String categoryPictureLocation) {
		this.categoryPictureLocation = categoryPictureLocation;
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
