package com.mingtu.common.service;

import com.mingtu.common.entity.RegInfo;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;

/**
 * Created by Hunter on 2020-07-03.
 */
public interface RegInfoService {

    RegInfo getById(Long id);

    int save(RegInfo regInfo);

    int delete(RegInfo regInfo);

    int deleteByIds(Long[] ids);

    boolean exist(RegInfo regInfo);

    PagingResult<RegInfo> findByItem(RegInfo regInfo, LayuiPage page);

}
