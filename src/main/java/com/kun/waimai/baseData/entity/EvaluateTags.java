package com.kun.waimai.baseData.entity;

import com.kun.waimai.base.common.IdEntity;

import java.util.Date;

/**
 *
 * 外卖评价标签表
 *
 */
public class EvaluateTags extends IdEntity {

	/** 标签类型（1：骑手端 2：商家端） **/ 
	private Integer evaluateTagsType;
	/** 标签名称 **/ 
	private String evaluateTagsName;
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
	public EvaluateTags(){
		super();
	}
	
	/** 有参构造函数 **/
	public EvaluateTags(Integer evaluateTagsType,String evaluateTagsName,String creater,Date createTime,Integer createrId,String updater,Date updateTime,Integer updaterId){
		super();
		this.evaluateTagsType = evaluateTagsType;
		this.evaluateTagsName = evaluateTagsName;
		this.creater = creater;
		this.createTime = createTime;
		this.createrId = createrId;
		this.updater = updater;
		this.updateTime = updateTime;
		this.updaterId = updaterId;
	}
 	
		
	/**
	 * @return 标签类型（1：骑手端 2：商家端）
	 */
	public Integer getEvaluateTagsType() {
		return evaluateTagsType;
	}
	/**
	 * @param evaluateTagsType 标签类型（1：骑手端 2：商家端）
	 */
	public void setEvaluateTagsType(Integer evaluateTagsType) {
		this.evaluateTagsType = evaluateTagsType;
	}
		
	/**
	 * @return 标签名称
	 */
	public String getEvaluateTagsName() {
		return evaluateTagsName;
	}
	/**
	 * @param evaluateTagsName 标签名称
	 */
	public void setEvaluateTagsName(String evaluateTagsName) {
		this.evaluateTagsName = evaluateTagsName;
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
