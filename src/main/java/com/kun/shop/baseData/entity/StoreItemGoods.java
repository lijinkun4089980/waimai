package com.kun.shop.baseData.entity;

import com.kun.shop.base.common.IdEntity;

import java.util.Date;

/**
 *
 * 门店商品分类子表
 *
 */
public class StoreItemGoods extends IdEntity {

	/** 分类主表ID **/ 
	private Integer storeMainGoodsId;
	/** 所属门店 **/ 
	private Integer storeId;
	/** 商品名称 **/ 
	private String goodsName;
	/** 商品图片 **/ 
	private String goodsPictureLocation;
	/** 商品单个费用 **/ 
	private double goodsCost;
	/** 商品餐盒费用 **/ 
	private double goodsPackingCost;
	/** 商品规格（如个、盒、套等） **/ 
	private String goodsSpecification;
	/** 备注 **/ 
	private String remark;
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
	public StoreItemGoods(){
		super();
	}
	
	/** 有参构造函数 **/
	public StoreItemGoods(Integer storeMainGoodsId,Integer storeId,String goodsName,String goodsPictureLocation,double goodsCost,double goodsPackingCost,String goodsSpecification,String remark,String creater,Date createTime,Integer createrId,String updater,Date updateTime,Integer updaterId){
		super();
		this.storeMainGoodsId = storeMainGoodsId;
		this.storeId = storeId;
		this.goodsName = goodsName;
		this.goodsPictureLocation = goodsPictureLocation;
		this.goodsCost = goodsCost;
		this.goodsPackingCost = goodsPackingCost;
		this.goodsSpecification = goodsSpecification;
		this.remark = remark;
		this.creater = creater;
		this.createTime = createTime;
		this.createrId = createrId;
		this.updater = updater;
		this.updateTime = updateTime;
		this.updaterId = updaterId;
	}
 	
		
	/**
	 * @return 分类主表ID
	 */
	public Integer getStoreMainGoodsId() {
		return storeMainGoodsId;
	}
	/**
	 * @param storeMainGoodsId 分类主表ID
	 */
	public void setStoreMainGoodsId(Integer storeMainGoodsId) {
		this.storeMainGoodsId = storeMainGoodsId;
	}
		
	/**
	 * @return 所属门店
	 */
	public Integer getStoreId() {
		return storeId;
	}
	/**
	 * @param storeId 所属门店
	 */
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
		
	/**
	 * @return 商品名称
	 */
	public String getGoodsName() {
		return goodsName;
	}
	/**
	 * @param goodsName 商品名称
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
		
	/**
	 * @return 商品图片
	 */
	public String getGoodsPictureLocation() {
		return goodsPictureLocation;
	}
	/**
	 * @param goodsPictureLocation 商品图片
	 */
	public void setGoodsPictureLocation(String goodsPictureLocation) {
		this.goodsPictureLocation = goodsPictureLocation;
	}
		
	/**
	 * @return 商品单个费用
	 */
	public double getGoodsCost() {
		return goodsCost;
	}
	/**
	 * @param goodsCost 商品单个费用
	 */
	public void setGoodsCost(double goodsCost) {
		this.goodsCost = goodsCost;
	}
		
	/**
	 * @return 商品餐盒费用
	 */
	public double getGoodsPackingCost() {
		return goodsPackingCost;
	}
	/**
	 * @param goodsPackingCost 商品餐盒费用
	 */
	public void setGoodsPackingCost(double goodsPackingCost) {
		this.goodsPackingCost = goodsPackingCost;
	}
		
	/**
	 * @return 商品规格（如个、盒、套等）
	 */
	public String getGoodsSpecification() {
		return goodsSpecification;
	}
	/**
	 * @param goodsSpecification 商品规格（如个、盒、套等）
	 */
	public void setGoodsSpecification(String goodsSpecification) {
		this.goodsSpecification = goodsSpecification;
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
