package com.kun.shop.baseData.entity;

import com.kun.shop.base.common.IdEntity;

import java.util.Date;

/**
 *
 * 用户搜索记录：顶部搜索点击弹出浮层并记录历史搜索
 *
 */
public class SearchRecord extends IdEntity {

	/** 用户ID **/ 
	private Integer userId;
	/** 用户姓名 **/ 
	private String userName;
	/** 搜索内容 **/ 
	private String searchContext;
	/** 创建时间 **/ 
	private Date createTime;
	
	/** 无参的构造函数 **/
	public SearchRecord(){
		super();
	}
	
	/** 有参构造函数 **/
	public SearchRecord(Integer userId,String userName,String searchContext,Date createTime){
		super();
		this.userId = userId;
		this.userName = userName;
		this.searchContext = searchContext;
		this.createTime = createTime;
	}
 	
		
	/**
	 * @return 用户ID
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId 用户ID
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
		
	/**
	 * @return 用户姓名
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName 用户姓名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
		
	/**
	 * @return 搜索内容
	 */
	public String getSearchContext() {
		return searchContext;
	}
	/**
	 * @param searchContext 搜索内容
	 */
	public void setSearchContext(String searchContext) {
		this.searchContext = searchContext;
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
 	
}
