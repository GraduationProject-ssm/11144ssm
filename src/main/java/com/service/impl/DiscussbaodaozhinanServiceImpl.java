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


import com.dao.DiscussbaodaozhinanDao;
import com.entity.DiscussbaodaozhinanEntity;
import com.service.DiscussbaodaozhinanService;
import com.entity.vo.DiscussbaodaozhinanVO;
import com.entity.view.DiscussbaodaozhinanView;

@Service("discussbaodaozhinanService")
public class DiscussbaodaozhinanServiceImpl extends ServiceImpl<DiscussbaodaozhinanDao, DiscussbaodaozhinanEntity> implements DiscussbaodaozhinanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbaodaozhinanEntity> page = this.selectPage(
                new Query<DiscussbaodaozhinanEntity>(params).getPage(),
                new EntityWrapper<DiscussbaodaozhinanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbaodaozhinanEntity> wrapper) {
		  Page<DiscussbaodaozhinanView> page =new Query<DiscussbaodaozhinanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbaodaozhinanVO> selectListVO(Wrapper<DiscussbaodaozhinanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbaodaozhinanVO selectVO(Wrapper<DiscussbaodaozhinanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbaodaozhinanView> selectListView(Wrapper<DiscussbaodaozhinanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbaodaozhinanView selectView(Wrapper<DiscussbaodaozhinanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
