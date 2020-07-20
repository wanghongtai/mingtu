package com.mingtu.common.service;

import com.mingtu.common.entity.UserSearch;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;

/**
 * Created by Hunter on 2020-07-11.
 */
public interface UserSearchService {
    UserSearch getById(Long id);

    int save(UserSearch item);

    int delete(UserSearch item);

    PagingResult<UserSearch> findByItem(UserSearch regInfo, LayuiPage page);
}
