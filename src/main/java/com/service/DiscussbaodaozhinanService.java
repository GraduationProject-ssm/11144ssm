package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbaodaozhinanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbaodaozhinanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbaodaozhinanView;


/**
 * 报道指南评论表
 *
 * @author 
 * @email 
 * @date 2020-12-27 19:32:49
 */
public interface DiscussbaodaozhinanService extends IService<DiscussbaodaozhinanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbaodaozhinanVO> selectListVO(Wrapper<DiscussbaodaozhinanEntity> wrapper);
   	
   	DiscussbaodaozhinanVO selectVO(@Param("ew") Wrapper<DiscussbaodaozhinanEntity> wrapper);
   	
   	List<DiscussbaodaozhinanView> selectListView(Wrapper<DiscussbaodaozhinanEntity> wrapper);
   	
   	DiscussbaodaozhinanView selectView(@Param("ew") Wrapper<DiscussbaodaozhinanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbaodaozhinanEntity> wrapper);
   	
}

