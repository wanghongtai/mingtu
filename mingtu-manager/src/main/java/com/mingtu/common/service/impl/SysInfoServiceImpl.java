package com.mingtu.common.service.impl;

import com.mingtu.common.entity.SysAccess;
import com.mingtu.common.mapper.SysAccessMapper;
import com.mingtu.common.service.SysInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * Created by Hunter on 2020-07-03.
 */
@Service
public class SysInfoServiceImpl implements SysInfoService {

    @Autowired
    private SysAccessMapper mapper;

    @Override
    public int count() {
        Example example = new Example(SysAccess.class);
        int count = mapper.selectCountByExample(example);
        return count;
    }
}