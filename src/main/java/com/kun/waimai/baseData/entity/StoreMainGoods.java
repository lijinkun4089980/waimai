package com.kun.waimai.baseData.entity;

import com.kun.waimai.base.common.IdEntity;

import java.util.Date;

/**
 *
 * 门店商品分类主表
 *
 */
public class StoreMainGoods extends IdEntity {

	/** 所属门店 **/ 
	private Integer storeId;
	/** 分类名称 **/ 
	private String storeMainGoodsName;
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
	public StoreMainGoods(){
		super();
	}
	
	/** 有参构造函数 **/
	public StoreMainGoods(Integer storeId,String storeMainGoodsName,String remark,String creater,Date createTime,Integer createrId,String updater,Date updateTime,Integer updaterId){
		super();
		this.storeId = storeId;
		this.storeMainGoodsName = storeMainGoodsName;
		this.remark = remark;
		this.creater = creater;
		this.createTime = createTime;
		this.createrId = createrId;
		this.updater = updater;
		this.updateTime = updateTime;
		this.updaterId = updaterId;
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
	 * @return 分类名称
	 */
	public String getStoreMainGoodsName() {
		return storeMainGoodsName;
	}
	/**
	 * @param storeMainGoodsName 分类名称
	 */
	public void setStoreMainGoodsName(String storeMainGoodsName) {
		this.storeMainGoodsName = storeMainGoodsName;
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
