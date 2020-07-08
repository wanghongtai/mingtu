package com.mingtu.common.service.impl;

import com.mingtu.common.entity.IndusBrandCore;
import com.mingtu.common.mapper.IndusBrandCoreMapper;
import com.mingtu.common.service.IndusBrandCoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Hunter on 2020-07-08.
 */
@Service
public class IndusBrandCoreServiceImpl implements IndusBrandCoreService {

    @Autowired
    private IndusBrandCoreMapper mapper;

    @Override
    public IndusBrandCore getById(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(IndusBrandCore item) {
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
}
