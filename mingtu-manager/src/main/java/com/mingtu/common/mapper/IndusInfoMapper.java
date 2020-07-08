package com.mingtu.common.mapper;

import com.mingtu.common.entity.IndusInfo;
import com.mingtu.common.entity.vo.IndusInfoVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

//@org.apache.ibatis.annotations.Mapper
public interface IndusInfoMapper extends Mapper<IndusInfo> {
    //获取行业信息，包含核心分类和关联分类
    List<IndusInfoVo> findByItemWithCoreCateList(IndusInfoVo vo);
    List<IndusInfoVo> findByItemWithRelateCateList(IndusInfoVo vo);
}
