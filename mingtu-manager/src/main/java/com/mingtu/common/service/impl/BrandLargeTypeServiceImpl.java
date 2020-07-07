package com.mingtu.common.service.impl;

import com.github.pagehelper.PageHelper;
import com.mingtu.common.entity.BrandLargeType;
import com.mingtu.common.entity.RecordStatus;
import com.mingtu.common.entity.vo.BrandLargeTypeVo;
import com.mingtu.common.lang.Objects;
import com.mingtu.common.mapper.BrandLargeTypeMapper;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;
import com.mingtu.common.service.BrandLargeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

@org.springframework.stereotype.Service
public class BrandLargeTypeServiceImpl implements BrandLargeTypeService {

    @Autowired
    protected BrandLargeTypeMapper mapper;


    @Override
    public BrandLargeType getBrandLargeType(Long id) {

        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int saveBrandLargeType(BrandLargeType brandLargeType) {
        int count = 0;
        if (!Objects.isEmpty(brandLargeType.getId())) {
            count = mapper.updateByPrimaryKeySelective(brandLargeType);
        } else {
            //insert方法是使用所有的属性作为字段使用,如INSERT INTO tb_user (AGE,USER_NAME,ID,NAME,BIRTHDAY,SEX,PASSWORD,UPDATED,CREATED) VALUES ( ?,?,?,?,?,?,?,?,? )，Parameters: null, null, null, sansan(String), null, null, null, null, null
            //insertSelective插入数据，使用不为null的属性作为字段使用，如 INSERT INTO tb_user ( ID,NAME ) VALUES ( ?,? )，Parameters: null, test_insertSelective(String)
            //TODO: 默认值
            brandLargeType.setRecordStatus(RecordStatus.ACTIVE);
            brandLargeType.setUpdateCount(0);
            brandLargeType.setCreateDate(new Date());
            count = mapper.insertSelective(brandLargeType);
        }
        return count;
    }

    @Override
    public int deleteBrandLargeType(BrandLargeType brandLargeType) {
        return mapper.deleteByPrimaryKey(brandLargeType);
    }

    @Override
    public PagingResult<BrandLargeType> findBrandLargeType(BrandLargeType type, LayuiPage page) {
        Example example = new Example(BrandLargeType.class);
        Example.Criteria cb = example.createCriteria();

        if (type != null && !Objects.isEmpty(type.getName())) {
            cb.andEqualTo("name", type.getName().trim());
        }
        cb.andEqualTo("recordStatus", RecordStatus.ACTIVE);
        example.setOrderByClause("catalog ASC");

        if (page != null) {
            PageHelper.startPage(page.getPage(), page.getLimit());
        }
        List<BrandLargeType> list = mapper.selectByExample(example);

        PagingResult<BrandLargeType> pageResult = new PagingResult<>(list);
        return pageResult;

    }

    @Override
    public List<BrandLargeType> findBrandLargeTypeList(BrandLargeType type) {

        Example example = new Example(BrandLargeType.class);
        Example.Criteria cb = example.createCriteria();

        if (type != null && !Objects.isEmpty(type.getName())) {
            cb.andEqualTo("name", type.getName().trim());
        }
        cb.andEqualTo("recordStatus", RecordStatus.ACTIVE);

        example.orderBy("catalog").asc();
        List<BrandLargeType> brandLargeTypeList = mapper.selectByExample(example);


        return brandLargeTypeList;
    }

    @Override
    public List<BrandLargeTypeVo> findBrandLargeTypeVo(BrandLargeTypeVo vo) {

        /*Integer startCat = null;
        Integer endCat = null;
        if (page != null) {
            startCat = (page.getPage() - 1) * page.getLimit();
            endCat = page.getLimit();
        }*/
        List<BrandLargeTypeVo> list = mapper.findBrandLargeTypeVo(vo);
        return list;
    }
}