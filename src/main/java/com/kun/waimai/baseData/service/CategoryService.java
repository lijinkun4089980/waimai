package com.kun.waimai.baseData.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kun.waimai.base.common.GlobalConfigure;
import com.kun.waimai.baseData.dao.CategoryMapper;
import com.kun.waimai.baseData.entity.Category;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = true)
public class CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    /**
     * 分页查询
     *
     * @param category
     * @param pageNo   页码
     */
    public PageInfo<Category> queryByPage(Category category, Integer pageNo) {
        PageHelper.startPage(pageNo, GlobalConfigure.DEFAULT_PAGE_SIZE);
        Map<String, Object> parameter = new HashMap<String, Object>();
        // TODO 查询参数
        List<Category> list = categoryMapper.findList(parameter);
        PageInfo<Category> page = new PageInfo<Category>(list);
        return page;
    }

    /**
     * 新增
     *
     * @param category
     */
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void addOne(Category category) {
        if (category == null) {
            throw new RuntimeException("要保存的对象为空,操作失败.");
        }
        this.categoryMapper.addOne(category);
    }

    /**
     * 修改
     *
     * @param category
     */
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void updateOne(Category category) {
        if (category == null) {
            throw new RuntimeException("要修改的对象为空,操作失败.");
        }
        if (category.getId() == null) {
            throw new RuntimeException("要修改的对象ID为空,操作失败.");
        }
        this.categoryMapper.updateOne(category);
    }

    /**
     * 根据ID删除
     *
     * @param id
     */
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void delById(Integer id) {
        if (null == id) {
            throw new RuntimeException("缺少参数ID,操作失败.");
        }
        this.categoryMapper.delById(id);
    }

    /**
     * 根据ID查询
     *
     * @param id
     * @return Category
     */
    public Category findById(Integer id) {
        if (null == id) {
            throw new RuntimeException("缺少参数ID,操作失败.");
        }
        Category category = this.categoryMapper.findById(id);
        return category;
    }
}
