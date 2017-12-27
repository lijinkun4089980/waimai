package com.kun.shop.baseData.entity;

import com.kun.shop.base.common.IdEntity;

import java.util.Date;

/**
 *
 * 门店表
 *
 */
public class Store extends IdEntity {

	/** 所属分类 **/ 
	private Integer categoryId;
	/** 门店名称 **/ 
	private String storeName;
	/** 门店图标地址 **/ 
	private String storePictureLocation;
	/** 起送价格 **/ 
	private double deliveryPrice;
	/** 配送费用 **/ 
	private double distributionCosts;
	/** 门店电话 **/ 
	private String storePhone;
	/** 门店经度 **/ 
	private double storeLongitude;
	/** 门店纬度 **/ 
	private double storeLatitude;
	/** 配送开始时间 **/ 
	private Date distributionStartTime;
	/** 配送结束时间 **/ 
	private Date distributionEndTime;
	/** 营业开始时间 **/ 
	private Date workStartTime;
	/** 营业结束时间 **/ 
	private Date workEndTime;
	/** 是否删除（0：否 1：是） **/ 
	private Integer isDelete;
	/** 是否营业（0：否 1：是） **/ 
	private Integer isOpen;
	/** 创建人 **/ 
	private String creater;
	/** 创建时间 **/ 
	private Date createTime;
	/** 创建人ID **/ 
	private Integer createrId;
	/** 更新人 **/ 
	private String updater;
	/** 更新时间 **/ 
	private Date updateTime;
	/** 更新人ID **/ 
	private Integer updaterId;
	
	/** 无参的构造函数 **/
	public Store(){
		super();
	}
	
	/** 有参构造函数 **/
	public Store(Integer categoryId,String storeName,String storePictureLocation,double deliveryPrice,double distributionCosts,String storePhone,double storeLongitude,double storeLatitude,Date distributionStartTime,Date distributionEndTime,Date workStartTime,Date workEndTime,Integer isDelete,Integer isOpen,String creater,Date createTime,Integer createrId,String updater,Date updateTime,Integer updaterId){
		super();
		this.categoryId = categoryId;
		this.storeName = storeName;
		this.storePictureLocation = storePictureLocation;
		this.deliveryPrice = deliveryPrice;
		this.distributionCosts = distributionCosts;
		this.storePhone = storePhone;
		this.storeLongitude = storeLongitude;
		this.storeLatitude = storeLatitude;
		this.distributionStartTime = distributionStartTime;
		this.distributionEndTime = distributionEndTime;
		this.workStartTime = workStartTime;
		this.workEndTime = workEndTime;
		this.isDelete = isDelete;
		this.isOpen = isOpen;
		this.creater = creater;
		this.createTime = createTime;
		this.createrId = createrId;
		this.updater = updater;
		this.updateTime = updateTime;
		this.updaterId = updaterId;
	}
 	
		
	/**
	 * @return 所属分类
	 */
	public Integer getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId 所属分类
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
		
	/**
	 * @return 门店名称
	 */
	public String getStoreName() {
		return storeName;
	}
	/**
	 * @param storeName 门店名称
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
		
	/**
	 * @return 门店图标地址
	 */
	public String getStorePictureLocation() {
		return storePictureLocation;
	}
	/**
	 * @param storePictureLocation 门店图标地址
	 */
	public void setStorePictureLocation(String storePictureLocation) {
		this.storePictureLocation = storePictureLocation;
	}
		
	/**
	 * @return 起送价格
	 */
	public double getDeliveryPrice() {
		return deliveryPrice;
	}
	/**
	 * @param deliveryPrice 起送价格
	 */
	public void setDeliveryPrice(double deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}
		
	/**
	 * @return 配送费用
	 */
	public double getDistributionCosts() {
		return distributionCosts;
	}
	/**
	 * @param distributionCosts 配送费用
	 */
	public void setDistributionCosts(double distributionCosts) {
		this.distributionCosts = distributionCosts;
	}
		
	/**
	 * @return 门店电话
	 */
	public String getStorePhone() {
		return storePhone;
	}
	/**
	 * @param storePhone 门店电话
	 */
	public void setStorePhone(String storePhone) {
		this.storePhone = storePhone;
	}
		
	/**
	 * @return 门店经度
	 */
	public double getStoreLongitude() {
		return storeLongitude;
	}
	/**
	 * @param storeLongitude 门店经度
	 */
	public void setStoreLongitude(double storeLongitude) {
		this.storeLongitude = storeLongitude;
	}
		
	/**
	 * @return 门店纬度
	 */
	public double getStoreLatitude() {
		return storeLatitude;
	}
	/**
	 * @param storeLatitude 门店纬度
	 */
	public void setStoreLatitude(double storeLatitude) {
		this.storeLatitude = storeLatitude;
	}
		
	/**
	 * @return 配送开始时间
	 */
	public Date getDistributionStartTime() {
		return distributionStartTime;
	}
	/**
	 * @param distributionStartTime 配送开始时间
	 */
	public void setDistributionStartTime(Date distributionStartTime) {
		this.distributionStartTime = distributionStartTime;
	}
		
	/**
	 * @return 配送结束时间
	 */
	public Date getDistributionEndTime() {
		return distributionEndTime;
	}
	/**
	 * @param distributionEndTime 配送结束时间
	 */
	public void setDistributionEndTime(Date distributionEndTime) {
		this.distributionEndTime = distributionEndTime;
	}
		
	/**
	 * @return 营业开始时间
	 */
	public Date getWorkStartTime() {
		return workStartTime;
	}
	/**
	 * @param workStartTime 营业开始时间
	 */
	public void setWorkStartTime(Date workStartTime) {
		this.workStartTime = workStartTime;
	}
		
	/**
	 * @return 营业结束时间
	 */
	public Date getWorkEndTime() {
		return workEndTime;
	}
	/**
	 * @param workEndTime 营业结束时间
	 */
	public void setWorkEndTime(Date workEndTime) {
		this.workEndTime = workEndTime;
	}
		
	/**
	 * @return 是否删除（0：否 1：是）
	 */
	public Integer getIsDelete() {
		return isDelete;
	}
	/**
	 * @param isDelete 是否删除（0：否 1：是）
	 */
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
		
	/**
	 * @return 是否营业（0：否 1：是）
	 */
	public Integer getIsOpen() {
		return isOpen;
	}
	/**
	 * @param isOpen 是否营业（0：否 1：是）
	 */
	public void setIsOpen(Integer isOpen) {
		this.isOpen = isOpen;
	}
		
	/**
	 * @return 创建人
	 */
	public String getCreater() {
		return creater;
	}
	/**
	 * @param creater 创建人
	 */
	public void setCreater(String creater) {
		this.creater = creater;
	}
		
	/**
	 * @return 创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime 创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
		
	/**
	 * @return 创建人ID
	 */
	public Integer getCreaterId() {
		return createrId;
	}
	/**
	 * @param createrId 创建人ID
	 */
	public void setCreaterId(Integer createrId) {
		this.createrId = createrId;
	}
		
	/**
	 * @return 更新人
	 */
	public String getUpdater() {
		return updater;
	}
	/**
	 * @param updater 更新人
	 */
	public void setUpdater(String updater) {
		this.updater = updater;
	}
		
	/**
	 * @return 更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * @param updateTime 更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
		
	/**
	 * @return 更新人ID
	 */
	public Integer getUpdaterId() {
		return updaterId;
	}
	/**
	 * @param updaterId 更新人ID
	 */
	public void setUpdaterId(Integer updaterId) {
		this.updaterId = updaterId;
	}
 	
}
