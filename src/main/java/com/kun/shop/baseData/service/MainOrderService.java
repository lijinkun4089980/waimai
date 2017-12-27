package com.kun.shop.baseData.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kun.shop.base.common.GlobalConfigure;
import com.kun.shop.baseData.dao.MainOrderMapper;
import com.kun.shop.baseData.entity.MainOrder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 
@Service
@Transactional(readOnly = true)
public class MainOrderService {
 	
 	@Resource
	private MainOrderMapper mainOrderMapper;
 	
 	/**
 	 * 分页查询
	 * @param mainOrder
	 * @param pageNo 页码
	 */
 	public PageInfo<MainOrder> queryByPage(MainOrder mainOrder, Integer pageNo) {
 		PageHelper.startPage(pageNo, GlobalConfigure.DEFAULT_PAGE_SIZE);
 		Map<String,Object> parameter = new HashMap<String, Object>();
 		// TODO 查询参数
 		List<MainOrder> list = mainOrderMapper.findList(parameter);
 		PageInfo<MainOrder> page = new PageInfo<MainOrder>(list);
 		return page;
 	}
 	
 	/**
 	 * 新增
	 * @param mainOrder
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void addOne(MainOrder mainOrder) {
 		if (mainOrder == null) {
 			throw new RuntimeException("要保存的对象为空,操作失败.");
 		}
 		this.mainOrderMapper.addOne(mainOrder);
 	}
 	
 	/**
 	 * 修改
	 * @param mainOrder
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void updateOne(MainOrder mainOrder) {
 		if (mainOrder == null) {
 			throw new RuntimeException("要修改的对象为空,操作失败.");
 		}
 		if (mainOrder.getId() == null) {
 			throw new RuntimeException("要修改的对象ID为空,操作失败.");
 		}
 		this.mainOrderMapper.updateOne(mainOrder);
 	}
 	
 	/**
 	 * 根据ID删除
	 * @param id
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void delById(Integer id) {
 		if (null == id) {
 			throw new RuntimeException("缺少参数ID,操作失败.");
 		}
 		this.mainOrderMapper.delById(id);
 	}
 	
 	/**
 	 * 根据ID查询
	 * @param id
	 * @return MainOrder
	 */
 	public MainOrder findById(Integer id) {
 		if (null == id) {
	 		throw new RuntimeException("缺少参数ID,操作失败.");
 		}
 		MainOrder mainOrder = this.mainOrderMapper.findById(id);
 		return mainOrder;
 	}
}
