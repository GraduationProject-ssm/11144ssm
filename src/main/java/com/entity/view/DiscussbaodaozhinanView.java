package com.entity.view;

import com.entity.DiscussbaodaozhinanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报道指南评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-27 19:32:49
 */
@TableName("discussbaodaozhinan")
public class DiscussbaodaozhinanView  extends DiscussbaodaozhinanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussbaodaozhinanView(){
	}
 
 	public DiscussbaodaozhinanView(DiscussbaodaozhinanEntity discussbaodaozhinanEntity){
 	try {
			BeanUtils.copyProperties(this, discussbaodaozhinanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
