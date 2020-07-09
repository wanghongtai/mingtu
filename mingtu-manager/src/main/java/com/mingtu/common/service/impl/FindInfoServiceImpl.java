package com.mingtu.common.service.impl;

import com.github.pagehelper.PageHelper;
import com.mingtu.common.entity.FindInfo;
import com.mingtu.common.lang.Dates;
import com.mingtu.common.lang.Objects;
import com.mingtu.common.mapper.FindInfoMapper;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;
import com.mingtu.common.service.FindInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * Created by Hunter on 2020-07-09.
 */
@Service
public class FindInfoServiceImpl implements FindInfoService {

    @Autowired
    private FindInfoMapper mapper;

    @Override
    public FindInfo getById(Long id) {
        return null;
    }

    @Override
    public int save(FindInfo item) {
        int count = 0;
        if(!Objects.isEmpty(item.getFindId())){
            count = mapper.updateByPrimaryKeySelective(item);
        }else{
            item.setFindCreateDate(new Date());
            count = mapper.insertSelective(item);
        }
        return count;
    }

    @Override
    public int delete(FindInfo item) {
        return mapper.deleteByPrimaryKey(item);
    }

    @Override
    public PagingResult<FindInfo> findByItem(FindInfo item, LayuiPage page) {
        Example example = new Example(FindInfo.class);
        Example.Criteria cb = example.createCriteria();
        example.orderBy("findCreateDate").desc();

        if(!Objects.isEmpty(item.getFindBrandName())) {
            cb.andLike("findBrandName", "%"+item.getFindBrandName()+"%");
        }
        if(!Objects.isEmpty(item.getFindConuntryName())) {
            cb.andLike("findConuntryName", "%"+item.getFindConuntryName()+"%");
        }
        if(!Objects.isEmpty(item.getFindPhone())) {
            cb.andLike("findPhone", "%"+item.getFindPhone()+"%");
        }
        try {
            if(!Objects.isEmpty(item) && !Objects.isEmpty(item.getFindCreateDate())) {
                cb.andBetween("findCreateDate", Dates.getDayBegin(item.getFindCreateDate()), Dates.getDayEnd(item.getFindCreateDate()));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        if (page != null) {
            PageHelper.startPage(page.getPage(), page.getLimit());
        }
        List<FindInfo> list = mapper.selectByExample(example);

        PagingResult<FindInfo> pageResult = new PagingResult<>(list);
        return pageResult;
    }
}
