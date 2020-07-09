package com.mingtu.common.service;

import com.mingtu.common.entity.FindInfo;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;

/**
 * Created by Hunter on 2020-07-09.
 */
public interface FindInfoService {

    FindInfo getById(Long id);

    int save(FindInfo item);

    int delete(FindInfo item);

    PagingResult<FindInfo> findByItem(FindInfo item, LayuiPage page);
}
