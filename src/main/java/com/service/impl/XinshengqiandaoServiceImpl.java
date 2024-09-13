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


import com.dao.XinshengqiandaoDao;
import com.entity.XinshengqiandaoEntity;
import com.service.XinshengqiandaoService;
import com.entity.vo.XinshengqiandaoVO;
import com.entity.view.XinshengqiandaoView;

@Service("xinshengqiandaoService")
public class XinshengqiandaoServiceImpl extends ServiceImpl<XinshengqiandaoDao, XinshengqiandaoEntity> implements XinshengqiandaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinshengqiandaoEntity> page = this.selectPage(
                new Query<XinshengqiandaoEntity>(params).getPage(),
                new EntityWrapper<XinshengqiandaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinshengqiandaoEntity> wrapper) {
		  Page<XinshengqiandaoView> page =new Query<XinshengqiandaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinshengqiandaoVO> selectListVO(Wrapper<XinshengqiandaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinshengqiandaoVO selectVO(Wrapper<XinshengqiandaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinshengqiandaoView> selectListView(Wrapper<XinshengqiandaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinshengqiandaoView selectView(Wrapper<XinshengqiandaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
