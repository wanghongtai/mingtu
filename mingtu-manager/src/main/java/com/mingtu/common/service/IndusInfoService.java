package com.mingtu.common.service;

import com.mingtu.common.entity.IndusInfo;
import com.mingtu.common.entity.vo.IndusInfoVo;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;

import java.util.List;

/**
 * Created by Hunter on 2020-07-08.
 */
public interface IndusInfoService {

    IndusInfo getById(Long id);

    int save(IndusInfo item);

    PagingResult<IndusInfo> findByItem(IndusInfo item, LayuiPage page);

    List<IndusInfoVo> findByItemWithCoreCateList(IndusInfoVo item);
    List<IndusInfoVo> findByItemWithRelateCateList(IndusInfoVo item);
    List<IndusInfoVo> findByItemWithAllCateList(IndusInfoVo item);
}
