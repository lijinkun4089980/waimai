package com.kun.waimai.baseData.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kun.waimai.base.common.GlobalConfigure;
import com.kun.waimai.baseData.dao.SearchRecordMapper;
import com.kun.waimai.baseData.entity.SearchRecord;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 
@Service
@Transactional(readOnly = true)
public class SearchRecordService {
 	
 	@Resource
	private SearchRecordMapper searchRecordMapper;
 	
 	/**
 	 * 分页查询
	 * @param searchRecord
	 * @param pageNo 页码
	 */
 	public PageInfo<SearchRecord> queryByPage(SearchRecord searchRecord, Integer pageNo) {
 		PageHelper.startPage(pageNo, GlobalConfigure.DEFAULT_PAGE_SIZE);
 		Map<String,Object> parameter = new HashMap<String, Object>();
 		// TODO 查询参数
 		List<SearchRecord> list = searchRecordMapper.findList(parameter);
 		PageInfo<SearchRecord> page = new PageInfo<SearchRecord>(list);
 		return page;
 	}
 	
 	/**
 	 * 新增
	 * @param searchRecord
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void addOne(SearchRecord searchRecord) {
 		if (searchRecord == null) {
 			throw new RuntimeException("要保存的对象为空,操作失败.");
 		}
 		this.searchRecordMapper.addOne(searchRecord);
 	}
 	
 	/**
 	 * 修改
	 * @param searchRecord
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void updateOne(SearchRecord searchRecord) {
 		if (searchRecord == null) {
 			throw new RuntimeException("要修改的对象为空,操作失败.");
 		}
 		if (searchRecord.getId() == null) {
 			throw new RuntimeException("要修改的对象ID为空,操作失败.");
 		}
 		this.searchRecordMapper.updateOne(searchRecord);
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
 		this.searchRecordMapper.delById(id);
 	}
 	
 	/**
 	 * 根据ID查询
	 * @param id
	 * @return SearchRecord
	 */
 	public SearchRecord findById(Integer id) {
 		if (null == id) {
	 		throw new RuntimeException("缺少参数ID,操作失败.");
 		}
 		SearchRecord searchRecord = this.searchRecordMapper.findById(id);
 		return searchRecord;
 	}
}
