package com.dao;

import com.entity.BaodaozhinanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaodaozhinanVO;
import com.entity.view.BaodaozhinanView;


/**
 * 报道指南
 * 
 * @author 
 * @email 
 * @date 2020-12-27 19:32:49
 */
public interface BaodaozhinanDao extends BaseMapper<BaodaozhinanEntity> {
	
	List<BaodaozhinanVO> selectListVO(@Param("ew") Wrapper<BaodaozhinanEntity> wrapper);
	
	BaodaozhinanVO selectVO(@Param("ew") Wrapper<BaodaozhinanEntity> wrapper);
	
	List<BaodaozhinanView> selectListView(@Param("ew") Wrapper<BaodaozhinanEntity> wrapper);

	List<BaodaozhinanView> selectListView(Pagination page,@Param("ew") Wrapper<BaodaozhinanEntity> wrapper);
	
	BaodaozhinanView selectView(@Param("ew") Wrapper<BaodaozhinanEntity> wrapper);
	
}
