package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XinshengqiandaoEntity;
import com.entity.view.XinshengqiandaoView;

import com.service.XinshengqiandaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 新生签到
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-27 19:32:49
 */
@RestController
@RequestMapping("/xinshengqiandao")
public class XinshengqiandaoController {
    @Autowired
    private XinshengqiandaoService xinshengqiandaoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XinshengqiandaoEntity xinshengqiandao, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			xinshengqiandao.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XinshengqiandaoEntity> ew = new EntityWrapper<XinshengqiandaoEntity>();
    	PageUtils page = xinshengqiandaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinshengqiandao), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XinshengqiandaoEntity xinshengqiandao, HttpServletRequest request){
        EntityWrapper<XinshengqiandaoEntity> ew = new EntityWrapper<XinshengqiandaoEntity>();
    	PageUtils page = xinshengqiandaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinshengqiandao), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XinshengqiandaoEntity xinshengqiandao){
       	EntityWrapper<XinshengqiandaoEntity> ew = new EntityWrapper<XinshengqiandaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xinshengqiandao, "xinshengqiandao")); 
        return R.ok().put("data", xinshengqiandaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XinshengqiandaoEntity xinshengqiandao){
        EntityWrapper< XinshengqiandaoEntity> ew = new EntityWrapper< XinshengqiandaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xinshengqiandao, "xinshengqiandao")); 
		XinshengqiandaoView xinshengqiandaoView =  xinshengqiandaoService.selectView(ew);
		return R.ok("查询新生签到成功").put("data", xinshengqiandaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        XinshengqiandaoEntity xinshengqiandao = xinshengqiandaoService.selectById(id);
        return R.ok().put("data", xinshengqiandao);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        XinshengqiandaoEntity xinshengqiandao = xinshengqiandaoService.selectById(id);
        return R.ok().put("data", xinshengqiandao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XinshengqiandaoEntity xinshengqiandao, HttpServletRequest request){
    	xinshengqiandao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinshengqiandao);

        xinshengqiandaoService.insert(xinshengqiandao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XinshengqiandaoEntity xinshengqiandao, HttpServletRequest request){
    	xinshengqiandao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinshengqiandao);

        xinshengqiandaoService.insert(xinshengqiandao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XinshengqiandaoEntity xinshengqiandao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xinshengqiandao);
        xinshengqiandaoService.updateById(xinshengqiandao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xinshengqiandaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XinshengqiandaoEntity> wrapper = new EntityWrapper<XinshengqiandaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = xinshengqiandaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
