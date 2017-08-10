package com.kun.waimai.baseData.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kun.waimai.base.common.GlobalConfigure;
import com.kun.waimai.baseData.dao.EvaluateMapper;
import com.kun.waimai.baseData.entity.Evaluate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 
@Service
@Transactional(readOnly = true)
public class EvaluateService {
 	
 	@Resource
	private EvaluateMapper evaluateMapper;
 	
 	/**
 	 * 分页查询
	 * @param evaluate
	 * @param pageNo 页码
	 */
 	public PageInfo<Evaluate> queryByPage(Evaluate evaluate, Integer pageNo) {
 		PageHelper.startPage(pageNo, GlobalConfigure.DEFAULT_PAGE_SIZE);
 		Map<String,Object> parameter = new HashMap<String, Object>();
 		// TODO 查询参数
 		List<Evaluate> list = evaluateMapper.findList(parameter);
 		PageInfo<Evaluate> page = new PageInfo<Evaluate>(list);
 		return page;
 	}
 	
 	/**
 	 * 新增
	 * @param evaluate
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void addOne(Evaluate evaluate) {
 		if (evaluate == null) {
 			throw new RuntimeException("要保存的对象为空,操作失败.");
 		}
 		this.evaluateMapper.addOne(evaluate);
 	}
 	
 	/**
 	 * 修改
	 * @param evaluate
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void updateOne(Evaluate evaluate) {
 		if (evaluate == null) {
 			throw new RuntimeException("要修改的对象为空,操作失败.");
 		}
 		if (evaluate.getId() == null) {
 			throw new RuntimeException("要修改的对象ID为空,操作失败.");
 		}
 		this.evaluateMapper.updateOne(evaluate);
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
 		this.evaluateMapper.delById(id);
 	}
 	
 	/**
 	 * 根据ID查询
	 * @param id
	 * @return Evaluate
	 */
 	public Evaluate findById(Integer id) {
 		if (null == id) {
	 		throw new RuntimeException("缺少参数ID,操作失败.");
 		}
 		Evaluate evaluate = this.evaluateMapper.findById(id);
 		return evaluate;
 	}
}
