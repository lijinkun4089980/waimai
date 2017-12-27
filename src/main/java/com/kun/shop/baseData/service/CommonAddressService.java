package com.kun.shop.baseData.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kun.shop.base.common.GlobalConfigure;
import com.kun.shop.baseData.dao.CommonAddressMapper;
import com.kun.shop.baseData.entity.CommonAddress;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 
@Service
@Transactional(readOnly = true)
public class CommonAddressService {
 	
 	@Resource
	private CommonAddressMapper commonAddressMapper;
 	
 	/**
 	 * 分页查询
	 * @param commonAddress
	 * @param pageNo 页码
	 */
 	public PageInfo<CommonAddress> queryByPage(CommonAddress commonAddress, Integer pageNo) {
 		PageHelper.startPage(pageNo, GlobalConfigure.DEFAULT_PAGE_SIZE);
 		Map<String,Object> parameter = new HashMap<String, Object>();
 		// TODO 查询参数
 		List<CommonAddress> list = commonAddressMapper.findList(parameter);
 		PageInfo<CommonAddress> page = new PageInfo<CommonAddress>(list);
 		return page;
 	}
 	
 	/**
 	 * 新增
	 * @param commonAddress
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void addOne(CommonAddress commonAddress) {
 		if (commonAddress == null) {
 			throw new RuntimeException("要保存的对象为空,操作失败.");
 		}
 		this.commonAddressMapper.addOne(commonAddress);
 	}
 	
 	/**
 	 * 修改
	 * @param commonAddress
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void updateOne(CommonAddress commonAddress) {
 		if (commonAddress == null) {
 			throw new RuntimeException("要修改的对象为空,操作失败.");
 		}
 		if (commonAddress.getId() == null) {
 			throw new RuntimeException("要修改的对象ID为空,操作失败.");
 		}
 		this.commonAddressMapper.updateOne(commonAddress);
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
 		this.commonAddressMapper.delById(id);
 	}
 	
 	/**
 	 * 根据ID查询
	 * @param id
	 * @return CommonAddress
	 */
 	public CommonAddress findById(Integer id) {
 		if (null == id) {
	 		throw new RuntimeException("缺少参数ID,操作失败.");
 		}
 		CommonAddress commonAddress = this.commonAddressMapper.findById(id);
 		return commonAddress;
 	}
}
