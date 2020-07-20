package com.mingtu.common.service;

import com.mingtu.common.entity.UserInfo;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;

/**
 * Created by Hunter on 2020-07-11.
 */
public interface UserInfoService {

    UserInfo getById(Long id);

    int save(UserInfo item);

    int delete(UserInfo item);

    PagingResult<UserInfo> findByItem(UserInfo regInfo, LayuiPage page);
}
