package com.kun.shop.baseData.entity;

import com.kun.shop.base.common.IdEntity;

import java.util.Date;

/**
 *
 * 外卖评价表
1.上方为配送员评价，可更改送达时间。
2.标签总后台设置，星级点击评论，标签为多选
 *
 */
public class Evaluate extends IdEntity {

	/** 订单ID **/ 
	private Integer mainOrderId;
	/** 门店ID **/ 
	private Integer storeId;
	/** 骑手ID **/ 
	private Integer userId;
	/** 评价类型（1：对门店评价 2：对骑手评价） **/ 
	private Integer evaluateType;
	/** 标签ID（选取后台自定义评价标签） **/ 
	private Integer evaluateTagId;
	/** 评论内容 **/ 
	private String evaluateContext;
	/** 评论星级（1-5星） **/ 
	private double evaluateStars;
	/** 送达时间（评价骑手得时间可以修改送达时间） **/ 
	private Date arriveTime;
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
	public Evaluate(){
		super();
	}
	
	/** 有参构造函数 **/
	public Evaluate(Integer mainOrderId,Integer storeId,Integer userId,Integer evaluateType,Integer evaluateTagId,String evaluateContext,double evaluateStars,Date arriveTime,String creater,Date createTime,Integer createrId,String updater,Date updateTime,Integer updaterId){
		super();
		this.mainOrderId = mainOrderId;
		this.storeId = storeId;
		this.userId = userId;
		this.evaluateType = evaluateType;
		this.evaluateTagId = evaluateTagId;
		this.evaluateContext = evaluateContext;
		this.evaluateStars = evaluateStars;
		this.arriveTime = arriveTime;
		this.creater = creater;
		this.createTime = createTime;
		this.createrId = createrId;
		this.updater = updater;
		this.updateTime = updateTime;
		this.updaterId = updaterId;
	}
 	
		
	/**
	 * @return 订单ID
	 */
	public Integer getMainOrderId() {
		return mainOrderId;
	}
	/**
	 * @param mainOrderId 订单ID
	 */
	public void setMainOrderId(Integer mainOrderId) {
		this.mainOrderId = mainOrderId;
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
	 * @return 骑手ID
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId 骑手ID
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
		
	/**
	 * @return 评价类型（1：对门店评价 2：对骑手评价）
	 */
	public Integer getEvaluateType() {
		return evaluateType;
	}
	/**
	 * @param evaluateType 评价类型（1：对门店评价 2：对骑手评价）
	 */
	public void setEvaluateType(Integer evaluateType) {
		this.evaluateType = evaluateType;
	}
		
	/**
	 * @return 标签ID（选取后台自定义评价标签）
	 */
	public Integer getEvaluateTagId() {
		return evaluateTagId;
	}
	/**
	 * @param evaluateTagId 标签ID（选取后台自定义评价标签）
	 */
	public void setEvaluateTagId(Integer evaluateTagId) {
		this.evaluateTagId = evaluateTagId;
	}
		
	/**
	 * @return 评论内容
	 */
	public String getEvaluateContext() {
		return evaluateContext;
	}
	/**
	 * @param evaluateContext 评论内容
	 */
	public void setEvaluateContext(String evaluateContext) {
		this.evaluateContext = evaluateContext;
	}
		
	/**
	 * @return 评论星级（1-5星）
	 */
	public double getEvaluateStars() {
		return evaluateStars;
	}
	/**
	 * @param evaluateStars 评论星级（1-5星）
	 */
	public void setEvaluateStars(double evaluateStars) {
		this.evaluateStars = evaluateStars;
	}
		
	/**
	 * @return 送达时间（评价骑手得时间可以修改送达时间）
	 */
	public Date getArriveTime() {
		return arriveTime;
	}
	/**
	 * @param arriveTime 送达时间（评价骑手得时间可以修改送达时间）
	 */
	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
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
