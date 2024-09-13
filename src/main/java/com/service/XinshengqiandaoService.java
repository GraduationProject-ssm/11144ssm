package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinshengqiandaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinshengqiandaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinshengqiandaoView;


/**
 * 新生签到
 *
 * @author 
 * @email 
 * @date 2020-12-27 19:32:49
 */
public interface XinshengqiandaoService extends IService<XinshengqiandaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinshengqiandaoVO> selectListVO(Wrapper<XinshengqiandaoEntity> wrapper);
   	
   	XinshengqiandaoVO selectVO(@Param("ew") Wrapper<XinshengqiandaoEntity> wrapper);
   	
   	List<XinshengqiandaoView> selectListView(Wrapper<XinshengqiandaoEntity> wrapper);
   	
   	XinshengqiandaoView selectView(@Param("ew") Wrapper<XinshengqiandaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinshengqiandaoEntity> wrapper);
   	
}

