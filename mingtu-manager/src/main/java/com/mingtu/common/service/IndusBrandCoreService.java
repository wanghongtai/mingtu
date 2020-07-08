package com.mingtu.common.service;

import com.mingtu.common.entity.IndusBrandCore;
import com.mingtu.common.entity.IndusBrandRelate;

/**
 * Created by Hunter on 2020-07-08.
 */
public interface IndusBrandCoreService {

    IndusBrandCore getById(Long id);

    int save(IndusBrandCore item);

}
