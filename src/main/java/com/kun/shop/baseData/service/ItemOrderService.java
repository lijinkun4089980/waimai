package com.kun.shop.baseData.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kun.shop.base.common.GlobalConfigure;
import com.kun.shop.baseData.dao.ItemOrderMapper;
import com.kun.shop.baseData.entity.ItemOrder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 
@Service
@Transactional(readOnly = true)
public class ItemOrderService {
 	
 	@Resource
	private ItemOrderMapper itemOrderMapper;
 	
 	/**
 	 * 分页查询
	 * @param itemOrder
	 * @param pageNo 页码
	 */
 	public PageInfo<ItemOrder> queryByPage(ItemOrder itemOrder, Integer pageNo) {
 		PageHelper.startPage(pageNo, GlobalConfigure.DEFAULT_PAGE_SIZE);
 		Map<String,Object> parameter = new HashMap<String, Object>();
 		// TODO 查询参数
 		List<ItemOrder> list = itemOrderMapper.findList(parameter);
 		PageInfo<ItemOrder> page = new PageInfo<ItemOrder>(list);
 		return page;
 	}
 	
 	/**
 	 * 新增
	 * @param itemOrder
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void addOne(ItemOrder itemOrder) {
 		if (itemOrder == null) {
 			throw new RuntimeException("要保存的对象为空,操作失败.");
 		}
 		this.itemOrderMapper.addOne(itemOrder);
 	}
 	
 	/**
 	 * 修改
	 * @param itemOrder
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void updateOne(ItemOrder itemOrder) {
 		if (itemOrder == null) {
 			throw new RuntimeException("要修改的对象为空,操作失败.");
 		}
 		if (itemOrder.getId() == null) {
 			throw new RuntimeException("要修改的对象ID为空,操作失败.");
 		}
 		this.itemOrderMapper.updateOne(itemOrder);
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
 		this.itemOrderMapper.delById(id);
 	}
 	
 	/**
 	 * 根据ID查询
	 * @param id
	 * @return ItemOrder
	 */
 	public ItemOrder findById(Integer id) {
 		if (null == id) {
	 		throw new RuntimeException("缺少参数ID,操作失败.");
 		}
 		ItemOrder itemOrder = this.itemOrderMapper.findById(id);
 		return itemOrder;
 	}
}
