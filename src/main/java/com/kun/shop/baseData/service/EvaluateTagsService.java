package com.kun.shop.baseData.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kun.shop.base.common.GlobalConfigure;
import com.kun.shop.baseData.dao.EvaluateTagsMapper;
import com.kun.shop.baseData.entity.EvaluateTags;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 
@Service
@Transactional(readOnly = true)
public class EvaluateTagsService {
 	
 	@Resource
	private EvaluateTagsMapper evaluateTagsMapper;
 	
 	/**
 	 * 分页查询
	 * @param evaluateTags
	 * @param pageNo 页码
	 */
 	public PageInfo<EvaluateTags> queryByPage(EvaluateTags evaluateTags, Integer pageNo) {
 		PageHelper.startPage(pageNo, GlobalConfigure.DEFAULT_PAGE_SIZE);
 		Map<String,Object> parameter = new HashMap<String, Object>();
 		// TODO 查询参数
 		List<EvaluateTags> list = evaluateTagsMapper.findList(parameter);
 		PageInfo<EvaluateTags> page = new PageInfo<EvaluateTags>(list);
 		return page;
 	}
 	
 	/**
 	 * 新增
	 * @param evaluateTags
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void addOne(EvaluateTags evaluateTags) {
 		if (evaluateTags == null) {
 			throw new RuntimeException("要保存的对象为空,操作失败.");
 		}
 		this.evaluateTagsMapper.addOne(evaluateTags);
 	}
 	
 	/**
 	 * 修改
	 * @param evaluateTags
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void updateOne(EvaluateTags evaluateTags) {
 		if (evaluateTags == null) {
 			throw new RuntimeException("要修改的对象为空,操作失败.");
 		}
 		if (evaluateTags.getId() == null) {
 			throw new RuntimeException("要修改的对象ID为空,操作失败.");
 		}
 		this.evaluateTagsMapper.updateOne(evaluateTags);
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
 		this.evaluateTagsMapper.delById(id);
 	}
 	
 	/**
 	 * 根据ID查询
	 * @param id
	 * @return EvaluateTags
	 */
 	public EvaluateTags findById(Integer id) {
 		if (null == id) {
	 		throw new RuntimeException("缺少参数ID,操作失败.");
 		}
 		EvaluateTags evaluateTags = this.evaluateTagsMapper.findById(id);
 		return evaluateTags;
 	}
}
