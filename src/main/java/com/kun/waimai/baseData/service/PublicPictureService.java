package com.kun.waimai.baseData.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kun.waimai.base.common.GlobalConfigure;
import com.kun.waimai.baseData.dao.PublicPictureMapper;
import com.kun.waimai.baseData.entity.PublicPicture;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 
@Service
@Transactional(readOnly = true)
public class PublicPictureService {
 	
 	@Resource
	private PublicPictureMapper publicPictureMapper;
 	
 	/**
 	 * 分页查询
	 * @param publicPicture
	 * @param pageNo 页码
	 */
 	public PageInfo<PublicPicture> queryByPage(PublicPicture publicPicture, Integer pageNo) {
 		PageHelper.startPage(pageNo, GlobalConfigure.DEFAULT_PAGE_SIZE);
 		Map<String,Object> parameter = new HashMap<String, Object>();
 		// TODO 查询参数
 		List<PublicPicture> list = publicPictureMapper.findList(parameter);
 		PageInfo<PublicPicture> page = new PageInfo<PublicPicture>(list);
 		return page;
 	}
 	
 	/**
 	 * 新增
	 * @param publicPicture
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void addOne(PublicPicture publicPicture) {
 		if (publicPicture == null) {
 			throw new RuntimeException("要保存的对象为空,操作失败.");
 		}
 		this.publicPictureMapper.addOne(publicPicture);
 	}
 	
 	/**
 	 * 修改
	 * @param publicPicture
	 */
 	@Transactional(readOnly = false, rollbackFor = Exception.class)
 	public void updateOne(PublicPicture publicPicture) {
 		if (publicPicture == null) {
 			throw new RuntimeException("要修改的对象为空,操作失败.");
 		}
 		if (publicPicture.getId() == null) {
 			throw new RuntimeException("要修改的对象ID为空,操作失败.");
 		}
 		this.publicPictureMapper.updateOne(publicPicture);
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
 		this.publicPictureMapper.delById(id);
 	}
 	
 	/**
 	 * 根据ID查询
	 * @param id
	 * @return PublicPicture
	 */
 	public PublicPicture findById(Integer id) {
 		if (null == id) {
	 		throw new RuntimeException("缺少参数ID,操作失败.");
 		}
 		PublicPicture publicPicture = this.publicPictureMapper.findById(id);
 		return publicPicture;
 	}
}
