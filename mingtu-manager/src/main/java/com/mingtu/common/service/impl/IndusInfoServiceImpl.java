package com.mingtu.common.service.impl;

import com.github.pagehelper.PageHelper;
import com.mingtu.common.entity.BrandLargeType;
import com.mingtu.common.entity.IndusInfo;
import com.mingtu.common.entity.vo.IndusInfoVo;
import com.mingtu.common.lang.Objects;
import com.mingtu.common.mapper.IndusInfoMapper;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;
import com.mingtu.common.service.IndusInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * Created by Hunter on 2020-07-08.
 */
@Service
public class IndusInfoServiceImpl implements IndusInfoService {

    @Autowired
    private IndusInfoMapper mapper;

    @Override
    public IndusInfo getById(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(IndusInfo item) {
        int count = 0;
        if (item.getId() != null) {
            count = mapper.updateByPrimaryKeySelective(item);
        } else {
            //insertSelective插入数据，使用不为null的属性作为字段使用，如 INSERT INTO tb_user ( ID,NAME ) VALUES ( ?,? )，Parameters: null, test_insertSelective(String)
            item.setCreateDate(new Date());
            count = mapper.insertSelective(item);
        }
        return count;
    }

    @Override
    public PagingResult<IndusInfo> findByItem(IndusInfo item, LayuiPage page) {
        Example example = new Example(IndusInfo.class);
        Example.Criteria cb = example.createCriteria();
        if (item != null && !Objects.isEmpty(item.getName())) {
            cb.andEqualTo("name", item.getName().trim());
        }
        List<IndusInfo> list = mapper.selectByExample(example);
        if (page != null) {
            PageHelper.startPage(page.getPage(), page.getLimit());
        }
        PagingResult<IndusInfo> pageResult = new PagingResult<>(list);
        return pageResult;
    }

    @Override
    public List<IndusInfoVo> findByItemWithCoreCateList(IndusInfoVo vo) {
        List<IndusInfoVo> list = mapper.findByItemWithCoreCateList(vo);
        return list;
    }

    @Override
    public List<IndusInfoVo> findByItemWithRelateCateList(IndusInfoVo vo) {
        List<IndusInfoVo> list = mapper.findByItemWithRelateCateList(vo);
        return list;
    }

    @Override
    public List<IndusInfoVo> findByItemWithAllCateList(IndusInfoVo vo) {
        List<IndusInfoVo> list1 = mapper.findByItemWithCoreCateList(vo);
        List<IndusInfoVo> list2 = mapper.findByItemWithRelateCateList(vo);


        if (list1 != null && list2 != null && list1.size()==list2.size()) {
            for(int i=0; i<list1.size(); i++){
                IndusInfoVo indusInfoVo1 = list1.get(i);
                IndusInfoVo indusInfoVo2 = list2.get(i);
                indusInfoVo1.setRelateCateList(indusInfoVo2.getRelateCateList());
                //System.out.println(indusInfoVo1);
            }
        }
        return list1;
    }
}
