package com.mingtu.common.service.impl;

import com.github.pagehelper.PageHelper;
import com.mingtu.common.entity.UserSearch;
import com.mingtu.common.lang.Objects;
import com.mingtu.common.mapper.UserSearchMapper;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;
import com.mingtu.common.service.UserSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * Created by Hunter on 2020-07-11.
 */
@Service
public class UserSearchServiceImpl implements UserSearchService {


    @Autowired
    private UserSearchMapper mapper;

    @Override
    public UserSearch getById(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(UserSearch item) {
        int count = 0;
        if (item.getId() != null) {
            count = mapper.updateByPrimaryKeySelective(item);
        } else {
            //insertSelective插入数据，使用不为null的属性作为字段使用，如 INSERT INTO tb_user ( ID,NAME ) VALUES ( ?,? )，Parameters: null, test_insertSelective(String)
            item.setCreateTime(new Date());
            count = mapper.insertSelective(item);
        }
        return count;
    }

    @Override
    public int delete(UserSearch item) {
        return mapper.deleteByPrimaryKey(item);
    }

    @Override
    public PagingResult<UserSearch> findByItem(UserSearch item, LayuiPage page) {
        Example example = new Example(UserSearch.class);
        Example.Criteria cb = example.createCriteria();
        if (item != null && !Objects.isEmpty(item.getCname())){
            cb.andEqualTo("cname", item.getCname());
        }
        if (item != null && !Objects.isEmpty(item.getTel())){
            cb.andEqualTo("tel", item.getTel());
        }
        //根据创建时间倒序
        example.orderBy("createTime").desc();

        if (page != null) {
            PageHelper.startPage(page.getPage(), page.getLimit());
        }

        List<UserSearch> list = mapper.selectByExample(example);
        PagingResult<UserSearch> pageResult = new PagingResult(list);
        return pageResult;
    }
}
