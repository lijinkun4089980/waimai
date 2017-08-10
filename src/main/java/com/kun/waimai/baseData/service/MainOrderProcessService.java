package com.kun.waimai.baseData.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kun.waimai.base.common.GlobalConfigure;
import com.kun.waimai.baseData.dao.MainOrderProcessMapper;
import com.kun.waimai.baseData.entity.MainOrderProcess;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 
@Service
@Transactional(readOnly = true)
public class MainOrderProcessService {
 	
 	@Resource
	private MainOrderProcessMapper mainOrderProcessMapper;
 	
 	/**
 	 * 分页查询
	 * @param mainOrderProcess
	 * @param pageNo 页码
	 */
 	public PageInfo<MainOrderProcess> queryByPage(MainOrderProcess mainOrderProcess, Integer pageNo) {
 		PageHelper.startPage(pageNo, GlobalConfigure.DEFAULT_PAGE_SIZE);
 		Map<String,Object> parameter = new HashMap<String, Object>();
 		// TODO 查询参数
 		List<MainOrderProcess> list = mainOrderProcessMapper.findList(parameter);
 		PageInfo<MainOrderProcess> page = new PageInfo<MainOrderProcess>(list);
 		return page;
 	}
 	
 	/**
 	 * 新增
	 * @param mainOrderProcess
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void addOne(MainOrderProcess mainOrderProcess) {
 		if (mainOrderProcess == null) {
 			throw new RuntimeException("要保存的对象为空,操作失败.");
 		}
 		this.mainOrderProcessMapper.addOne(mainOrderProcess);
 	}
 	
 	/**
 	 * 修改
	 * @param mainOrderProcess
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void updateOne(MainOrderProcess mainOrderProcess) {
 		if (mainOrderProcess == null) {
 			throw new RuntimeException("要修改的对象为空,操作失败.");
 		}
 		if (mainOrderProcess.getId() == null) {
 			throw new RuntimeException("要修改的对象ID为空,操作失败.");
 		}
 		this.mainOrderProcessMapper.updateOne(mainOrderProcess);
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
 		this.mainOrderProcessMapper.delById(id);
 	}
 	
 	/**
 	 * 根据ID查询
	 * @param id
	 * @return MainOrderProcess
	 */
 	public MainOrderProcess findById(Integer id) {
 		if (null == id) {
	 		throw new RuntimeException("缺少参数ID,操作失败.");
 		}
 		MainOrderProcess mainOrderProcess = this.mainOrderProcessMapper.findById(id);
 		return mainOrderProcess;
 	}
}
