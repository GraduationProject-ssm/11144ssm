package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaodaozhinanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaodaozhinanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaodaozhinanView;


/**
 * 报道指南
 *
 * @author 
 * @email 
 * @date 2020-12-27 19:32:49
 */
public interface BaodaozhinanService extends IService<BaodaozhinanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaodaozhinanVO> selectListVO(Wrapper<BaodaozhinanEntity> wrapper);
   	
   	BaodaozhinanVO selectVO(@Param("ew") Wrapper<BaodaozhinanEntity> wrapper);
   	
   	List<BaodaozhinanView> selectListView(Wrapper<BaodaozhinanEntity> wrapper);
   	
   	BaodaozhinanView selectView(@Param("ew") Wrapper<BaodaozhinanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaodaozhinanEntity> wrapper);
   	
}

