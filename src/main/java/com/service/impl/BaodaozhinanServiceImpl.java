package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BaodaozhinanDao;
import com.entity.BaodaozhinanEntity;
import com.service.BaodaozhinanService;
import com.entity.vo.BaodaozhinanVO;
import com.entity.view.BaodaozhinanView;

@Service("baodaozhinanService")
public class BaodaozhinanServiceImpl extends ServiceImpl<BaodaozhinanDao, BaodaozhinanEntity> implements BaodaozhinanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaodaozhinanEntity> page = this.selectPage(
                new Query<BaodaozhinanEntity>(params).getPage(),
                new EntityWrapper<BaodaozhinanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaodaozhinanEntity> wrapper) {
		  Page<BaodaozhinanView> page =new Query<BaodaozhinanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaodaozhinanVO> selectListVO(Wrapper<BaodaozhinanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaodaozhinanVO selectVO(Wrapper<BaodaozhinanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaodaozhinanView> selectListView(Wrapper<BaodaozhinanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaodaozhinanView selectView(Wrapper<BaodaozhinanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
