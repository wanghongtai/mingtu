package com.mingtu.common.service;

import com.mingtu.common.entity.SysAccess;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;

/**
 * Created by Hunter on 2020-07-03.
 */
public interface SysAccessService {

    SysAccess getById(Long id);

    int save(SysAccess item);

    int delete(SysAccess item);

    int deleteByIds(Long[] ids);

    PagingResult<SysAccess> findByItem(SysAccess item, LayuiPage page);

}
