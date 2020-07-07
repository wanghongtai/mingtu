package com.mingtu.common.service.impl;

import com.github.pagehelper.PageHelper;
import com.mingtu.common.entity.BrandLargeType;
import com.mingtu.common.entity.BrandSmallType;
import com.mingtu.common.entity.RecordStatus;
import com.mingtu.common.entity.vo.BrandSmallTypeVo;
import com.mingtu.common.lang.Objects;
import com.mingtu.common.mapper.BrandSmallTypeMapper;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;
import com.mingtu.common.service.BrandSmallTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.Weekend;
import tk.mybatis.mapper.weekend.WeekendCriteria;

import java.util.Date;
import java.util.List;

@org.springframework.stereotype.Service
public class BrandSmallTypeServiceImpl implements BrandSmallTypeService {

	@Autowired
	protected BrandSmallTypeMapper mapper;

	@Override
	public BrandSmallType getBrandSmallType(String smallNo) {

		return mapper.selectByPrimaryKey(smallNo);
	}

	@Override
	public BrandSmallType getBrandSmallType(Long SmallTypeId) {
		return mapper.selectByPrimaryKey(SmallTypeId);
	}

	@Override
	public int saveBrandSmallType(BrandSmallType brandSmallType) {

		int count = 0;
		if(!Objects.isEmpty(brandSmallType.getId())){
			count = mapper.updateByPrimaryKeySelective(brandSmallType);
		}else{
			brandSmallType.setRecordStatus(RecordStatus.ACTIVE);
			brandSmallType.setUpdateCount(0);
			brandSmallType.setCreateDate(new Date());
			count = mapper.insertSelective(brandSmallType);
		}
		return count;
	}

	@Override
	public int deleteBrandSmallType(BrandSmallType brandSmallType) {

		return mapper.deleteByPrimaryKey(brandSmallType);
	}

	@Override
	public PagingResult<BrandSmallType> findBrandSmallType(BrandSmallTypeVo item, LayuiPage page) {
		Example example = new Example(BrandLargeType.class);
		Example.Criteria cb = example.createCriteria();
		example.setOrderByClause("create_date DESC");

		if(!Objects.isEmpty(item.getName())) {
			cb.andLike("name", "%"+item.getName()+"%");
		}
		if(!Objects.isEmpty(item.getLargeTypeId())) {
			cb.andEqualTo("largeTypeId", item.getLargeTypeId());
		}
		if(!Objects.isEmpty(item) && !Objects.isEmpty(item.getNo())) {
			example.createCriteria().andEqualTo("no", item.getNo());
		}

		//复杂 or条件查询
        Weekend<BrandSmallType> weekend = new Weekend<>(BrandSmallType.class);
        WeekendCriteria<BrandSmallType, Object> keywordCriteria = weekend.weekendCriteria();
        if (!Objects.isEmpty(item.getFilter())) {
			keywordCriteria.orLike("name", "%" + item.getFilter().trim() + "%");
        }
        weekend.and(cb);

		if (page != null) {
			PageHelper.startPage(page.getPage(), page.getLimit());
		}
		List<BrandSmallType> list = mapper.selectByExample(example);

		PagingResult<BrandSmallType> pageResult = new PagingResult<>(list);
		return pageResult;
	}

	@Override
	public List<BrandSmallType> findBrandSmallTypeList(BrandSmallTypeVo item) {
		Example example = new Example(BrandLargeType.class);
		Example.Criteria cb = example.createCriteria();
		example.setOrderByClause("create_date DESC");

		if(!Objects.isEmpty(item.getName())) {
			cb.andLike("name", "%"+item.getName()+"%");
		}
		if(!Objects.isEmpty(item.getLargeTypeId())) {
			cb.andEqualTo("largeTypeId", item.getLargeTypeId());
		}
		if(!Objects.isEmpty(item) && !Objects.isEmpty(item.getNo())) {
			example.createCriteria().andEqualTo("no", item.getNo());
		}

		//复杂 or条件查询
		Weekend<BrandSmallType> weekend = new Weekend<>(BrandSmallType.class);
		WeekendCriteria<BrandSmallType, Object> keywordCriteria = weekend.weekendCriteria();
		if (!Objects.isEmpty(item.getFilter())) {
			keywordCriteria.orLike("name", "%" + item.getFilter().trim() + "%");
		}
		weekend.and(cb);

		List<BrandSmallType> list = mapper.selectByExample(example);
		return list;
	}
}