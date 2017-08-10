package com.kun.waimai.baseData.entity;

import com.kun.waimai.base.common.IdEntity;

import java.util.Date;

/**
 *
 * 订单主表
 *
 */
public class MainOrder extends IdEntity {

	/** 订单编号（年+月+日+000001） **/ 
	private String mainOrderNo;
	/** 门店ID **/ 
	private Integer storeId;
	/** 订单状态（1：待付款 2：待使用 3：待评价 4：退款/售后） **/ 
	private Integer mainOrderStatus;
	/** 收货人 **/ 
	private String receiveName;
	/** 收货电话 **/ 
	private String receivePhone;
	/** 是否评价（0：否 1：是） **/ 
	private Integer isEvaluate;
	/** 订单总金额 **/ 
	private double mainOrderCost;
	/** 配送总费用 **/ 
	private double mainOrderDistributionCost;
	/** 餐盒总费用 **/ 
	private double mainOrderGoodsPackingCost;
	/** 优惠费用 **/ 
	private double mainOrderDiscountCost;
	/** 配送人ID **/ 
	private Integer distributionId;
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
	public MainOrder(){
		super();
	}
	
	/** 有参构造函数 **/
	public MainOrder(String mainOrderNo,Integer storeId,Integer mainOrderStatus,String receiveName,String receivePhone,Integer isEvaluate,double mainOrderCost,double mainOrderDistributionCost,double mainOrderGoodsPackingCost,double mainOrderDiscountCost,Integer distributionId,String remark,String creater,Date createTime,Integer createrId,String updater,Date updateTime,Integer updaterId){
		super();
		this.mainOrderNo = mainOrderNo;
		this.storeId = storeId;
		this.mainOrderStatus = mainOrderStatus;
		this.receiveName = receiveName;
		this.receivePhone = receivePhone;
		this.isEvaluate = isEvaluate;
		this.mainOrderCost = mainOrderCost;
		this.mainOrderDistributionCost = mainOrderDistributionCost;
		this.mainOrderGoodsPackingCost = mainOrderGoodsPackingCost;
		this.mainOrderDiscountCost = mainOrderDiscountCost;
		this.distributionId = distributionId;
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
	 * @return 订单状态（1：待付款 2：待使用 3：待评价 4：退款/售后）
	 */
	public Integer getMainOrderStatus() {
		return mainOrderStatus;
	}
	/**
	 * @param mainOrderStatus 订单状态（1：待付款 2：待使用 3：待评价 4：退款/售后）
	 */
	public void setMainOrderStatus(Integer mainOrderStatus) {
		this.mainOrderStatus = mainOrderStatus;
	}
		
	/**
	 * @return 收货人
	 */
	public String getReceiveName() {
		return receiveName;
	}
	/**
	 * @param receiveName 收货人
	 */
	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}
		
	/**
	 * @return 收货电话
	 */
	public String getReceivePhone() {
		return receivePhone;
	}
	/**
	 * @param receivePhone 收货电话
	 */
	public void setReceivePhone(String receivePhone) {
		this.receivePhone = receivePhone;
	}
		
	/**
	 * @return 是否评价（0：否 1：是）
	 */
	public Integer getIsEvaluate() {
		return isEvaluate;
	}
	/**
	 * @param isEvaluate 是否评价（0：否 1：是）
	 */
	public void setIsEvaluate(Integer isEvaluate) {
		this.isEvaluate = isEvaluate;
	}
		
	/**
	 * @return 订单总金额
	 */
	public double getMainOrderCost() {
		return mainOrderCost;
	}
	/**
	 * @param mainOrderCost 订单总金额
	 */
	public void setMainOrderCost(double mainOrderCost) {
		this.mainOrderCost = mainOrderCost;
	}
		
	/**
	 * @return 配送总费用
	 */
	public double getMainOrderDistributionCost() {
		return mainOrderDistributionCost;
	}
	/**
	 * @param mainOrderDistributionCost 配送总费用
	 */
	public void setMainOrderDistributionCost(double mainOrderDistributionCost) {
		this.mainOrderDistributionCost = mainOrderDistributionCost;
	}
		
	/**
	 * @return 餐盒总费用
	 */
	public double getMainOrderGoodsPackingCost() {
		return mainOrderGoodsPackingCost;
	}
	/**
	 * @param mainOrderGoodsPackingCost 餐盒总费用
	 */
	public void setMainOrderGoodsPackingCost(double mainOrderGoodsPackingCost) {
		this.mainOrderGoodsPackingCost = mainOrderGoodsPackingCost;
	}
		
	/**
	 * @return 优惠费用
	 */
	public double getMainOrderDiscountCost() {
		return mainOrderDiscountCost;
	}
	/**
	 * @param mainOrderDiscountCost 优惠费用
	 */
	public void setMainOrderDiscountCost(double mainOrderDiscountCost) {
		this.mainOrderDiscountCost = mainOrderDiscountCost;
	}
		
	/**
	 * @return 配送人ID
	 */
	public Integer getDistributionId() {
		return distributionId;
	}
	/**
	 * @param distributionId 配送人ID
	 */
	public void setDistributionId(Integer distributionId) {
		this.distributionId = distributionId;
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
