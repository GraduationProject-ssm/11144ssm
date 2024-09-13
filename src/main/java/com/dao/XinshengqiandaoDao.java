package com.dao;

import com.entity.XinshengqiandaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinshengqiandaoVO;
import com.entity.view.XinshengqiandaoView;


/**
 * 新生签到
 * 
 * @author 
 * @email 
 * @date 2020-12-27 19:32:49
 */
public interface XinshengqiandaoDao extends BaseMapper<XinshengqiandaoEntity> {
	
	List<XinshengqiandaoVO> selectListVO(@Param("ew") Wrapper<XinshengqiandaoEntity> wrapper);
	
	XinshengqiandaoVO selectVO(@Param("ew") Wrapper<XinshengqiandaoEntity> wrapper);
	
	List<XinshengqiandaoView> selectListView(@Param("ew") Wrapper<XinshengqiandaoEntity> wrapper);

	List<XinshengqiandaoView> selectListView(Pagination page,@Param("ew") Wrapper<XinshengqiandaoEntity> wrapper);
	
	XinshengqiandaoView selectView(@Param("ew") Wrapper<XinshengqiandaoEntity> wrapper);
	
}
