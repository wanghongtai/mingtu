package com.mingtu.common.service.impl;

import com.github.pagehelper.PageHelper;
import com.mingtu.common.entity.RegInfo;
import com.mingtu.common.lang.Objects;
import com.mingtu.common.mapper.RegInfoMapper;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;
import com.mingtu.common.service.RegInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * Created by Hunter on 2020-07-03.
 */
@Service
public class RegInfoServiceImpl implements RegInfoService {

    @Autowired
    private RegInfoMapper mapper;

    @Override
    public RegInfo getById(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(RegInfo item) {
        int count = 0;
        if (item.getRegId() != null) {
            count = mapper.updateByPrimaryKeySelective(item);
        } else {
            //insertSelective插入数据，使用不为null的属性作为字段使用，如 INSERT INTO tb_user ( ID,NAME ) VALUES ( ?,? )，Parameters: null, test_insertSelective(String)
            item.setCreateDate(new Date());
            count = mapper.insertSelective(item);
        }
        return count;
    }

    @Override
    public int delete(RegInfo regInfo) {
        return mapper.deleteByPrimaryKey(regInfo);
    }

    @Override
    public int deleteByIds(Long[] ids) {
        return 0;
    }

    @Override
    public boolean exist(RegInfo regInfo) {
        if (regInfo == null) {
            return true;
        }
        Example example = new Example(RegInfo.class);
        Example.Criteria cb = example.createCriteria();
        if (!Objects.isEmpty(regInfo.getBrandname())) {
            cb.andEqualTo("brandname", regInfo.getBrandname());
        }
        List<RegInfo> list = mapper.selectByExample(example);
        return list != null && list.size() > 0 ? true : false;
    }

    @Override
    public PagingResult<RegInfo> findByItem(RegInfo regInfo, LayuiPage page) {
        Example example = new Example(RegInfo.class);
        Example.Criteria cb = example.createCriteria();
        if (regInfo != null && !Objects.isEmpty(regInfo.getBrandname())){
            cb.andEqualTo("brandname", regInfo.getBrandname());
        }
        List<RegInfo> list = mapper.selectByExample(example);
        if (page != null) {
            PageHelper.startPage(page.getPage(), page.getLimit());
        }
        PagingResult<RegInfo> pageResult = new PagingResult<>(list);
        return pageResult;
    }
}
