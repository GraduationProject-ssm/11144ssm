package com.dao;

import com.entity.DiscussbaodaozhinanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbaodaozhinanVO;
import com.entity.view.DiscussbaodaozhinanView;


/**
 * 报道指南评论表
 * 
 * @author 
 * @email 
 * @date 2020-12-27 19:32:49
 */
public interface DiscussbaodaozhinanDao extends BaseMapper<DiscussbaodaozhinanEntity> {
	
	List<DiscussbaodaozhinanVO> selectListVO(@Param("ew") Wrapper<DiscussbaodaozhinanEntity> wrapper);
	
	DiscussbaodaozhinanVO selectVO(@Param("ew") Wrapper<DiscussbaodaozhinanEntity> wrapper);
	
	List<DiscussbaodaozhinanView> selectListView(@Param("ew") Wrapper<DiscussbaodaozhinanEntity> wrapper);

	List<DiscussbaodaozhinanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbaodaozhinanEntity> wrapper);
	
	DiscussbaodaozhinanView selectView(@Param("ew") Wrapper<DiscussbaodaozhinanEntity> wrapper);
	
}
