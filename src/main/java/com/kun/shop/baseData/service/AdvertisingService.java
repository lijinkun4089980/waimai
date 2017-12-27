package com.kun.shop.baseData.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kun.shop.base.common.GlobalConfigure;
import com.kun.shop.baseData.dao.AdvertisingMapper;
import com.kun.shop.baseData.entity.Advertising;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = true)
public class AdvertisingService {

    @Resource
    private AdvertisingMapper advertisingMapper;

    /**
     * 分页查询
     *
     * @param advertising
     * @param pageNo      页码
     */
    public PageInfo<Advertising> queryByPage(Advertising advertising, Integer pageNo) {
        PageHelper.startPage(pageNo, GlobalConfigure.DEFAULT_PAGE_SIZE);
        Map<String, Object> parameter = new HashMap<String, Object>();
        // TODO 查询参数
        List<Advertising> list = advertisingMapper.findList(parameter);
        PageInfo<Advertising> page = new PageInfo<Advertising>(list);
        return page;
    }

    /**
     * 新增
     *
     * @param advertising
     */
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void addOne(Advertising advertising) {
        if (advertising == null) {
            throw new RuntimeException("要保存的对象为空,操作失败.");
        }
        this.advertisingMapper.addOne(advertising);
    }

    /**
     * 修改
     *
     * @param advertising
     */
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public void updateOne(Advertising advertising) {
        if (advertising == null) {
            throw new RuntimeException("要修改的对象为空,操作失败.");
        }
        if (advertising.getId() == null) {
            throw new RuntimeException("要修改的对象ID为空,操作失败.");
        }
        this.advertisingMapper.updateOne(advertising);
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
        this.advertisingMapper.delById(id);
    }

    /**
     * 根据ID查询
     *
     * @param id
     * @return Advertising
     */
    public Advertising findById(Integer id) {
        if (null == id) {
            throw new RuntimeException("缺少参数ID,操作失败.");
        }
        Advertising advertising = this.advertisingMapper.findById(id);
        return advertising;
    }
}
