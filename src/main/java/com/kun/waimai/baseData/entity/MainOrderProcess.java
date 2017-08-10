package com.kun.waimai.baseData.entity;

import com.kun.waimai.base.common.IdEntity;

import java.util.Date;

/**
 *
 * 订单流程表
1.记录跟踪外卖的每一步骤。
2.申请退款总后台几门店批复。
3.三分钟
 *
 */
public class MainOrderProcess extends IdEntity {

	/** 订单编号（年+月+日+000001） **/ 
	private String mainOrderNo;
	/** 订单ID **/ 
	private Integer mainOrderId;
	/** 流程内容 **/ 
	private String processContext;
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
	public MainOrderProcess(){
		super();
	}
	
	/** 有参构造函数 **/
	public MainOrderProcess(String mainOrderNo,Integer mainOrderId,String processContext,String remark,String creater,Date createTime,Integer createrId,String updater,Date updateTime,Integer updaterId){
		super();
		this.mainOrderNo = mainOrderNo;
		this.mainOrderId = mainOrderId;
		this.processContext = processContext;
		this.remark = remark;
		this.creater = creater;
		this.createTime = createTime;
		this.createrId = createrId;
		this.updater = updater;
		this.updateTime = updateTime;
		this.updaterId = updaterId;
	}
 	
		
	/**
	 * @return 订单编号（年+月+日+000001）
	 */
	public String getMainOrderNo() {
		return mainOrderNo;
	}
	/**
	 * @param mainOrderNo 订单编号（年+月+日+000001）
	 */
	public void setMainOrderNo(String mainOrderNo) {
		this.mainOrderNo = mainOrderNo;
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
	 * @return 流程内容
	 */
	public String getProcessContext() {
		return processContext;
	}
	/**
	 * @param processContext 流程内容
	 */
	public void setProcessContext(String processContext) {
		this.processContext = processContext;
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
