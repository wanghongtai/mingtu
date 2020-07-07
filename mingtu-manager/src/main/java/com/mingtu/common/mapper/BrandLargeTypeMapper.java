package com.mingtu.common.mapper;

import com.mingtu.common.entity.BrandLargeType;
import com.mingtu.common.entity.vo.BrandLargeTypeVo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface BrandLargeTypeMapper extends Mapper<BrandLargeType> {
    //获取大类，包含子类列表
    List<BrandLargeTypeVo> findBrandLargeTypeVo(BrandLargeTypeVo vo);
}