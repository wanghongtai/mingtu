package com.mingtu.common.service.impl;

import com.github.pagehelper.PageHelper;
import com.mingtu.common.entity.RegInfo;
import com.mingtu.common.entity.SysAccess;
import com.mingtu.common.lang.Objects;
import com.mingtu.common.mapper.SysAccessMapper;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;
import com.mingtu.common.service.SysAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * Created by Hunter on 2020-07-03.
 */
public class SysAccessServiceImpl implements SysAccessService{

    @Autowired
    private SysAccessMapper mapper;

    @Override
    public SysAccess getById(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(SysAccess item) {
        int count = 0;
        if (item.getAccessId() != null) {
            count = mapper.updateByPrimaryKeySelective(item);
        } else {
            item.setAccessiDate(new Date());
            count = mapper.insertSelective(item);
        }
        return count;
    }

    @Override
    public int delete(SysAccess item) {
        return mapper.deleteByPrimaryKey(item);
    }

    @Override
    public int deleteByIds(Long[] ids) {
        return 0;
    }

    @Override
    public PagingResult<SysAccess> findByItem(SysAccess item, LayuiPage page) {
        Example example = new Example(SysAccess.class);
        Example.Criteria cb = example.createCriteria();
        if (item != null && !Objects.isEmpty(item.getAccessiDate())){
            cb.andEqualTo("accessIDdate", item.getAccessiDate());
        }
        List<SysAccess> list = mapper.selectByExample(example);
        if (page != null) {
            PageHelper.startPage(page.getPage(), page.getLimit());
        }
        PagingResult<SysAccess> pageResult = new PagingResult<>(list);
        return pageResult;
    }
}
