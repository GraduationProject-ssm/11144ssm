package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 健康码
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-27 19:32:49
 */
@TableName("jiankangma")
public class JiankangmaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangmaEntity() {
		
	}
	
	public JiankangmaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 专业
	 */
					
	private String zhuanye;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 健康码
	 */
					
	private String jiankangma;
	
	/**
	 * 更新日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date gengxinriqi;
	
	/**
	 * 打卡时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date dakashijian;
	
	/**
	 * 当前温度
	 */
					
	private Integer dangqianwendu;
	
	/**
	 * 是否不适
	 */
					
	private String shifoubushi;
	
	/**
	 * 是否就医
	 */
					
	private String shifoujiuyi;
	
	/**
	 * 其他情况
	 */
					
	private String qitaqingkuang;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：专业
	 */
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
	/**
	 * 设置：健康码
	 */
	public void setJiankangma(String jiankangma) {
		this.jiankangma = jiankangma;
	}
	/**
	 * 获取：健康码
	 */
	public String getJiankangma() {
		return jiankangma;
	}
	/**
	 * 设置：更新日期
	 */
	public void setGengxinriqi(Date gengxinriqi) {
		this.gengxinriqi = gengxinriqi;
	}
	/**
	 * 获取：更新日期
	 */
	public Date getGengxinriqi() {
		return gengxinriqi;
	}
	/**
	 * 设置：打卡时间
	 */
	public void setDakashijian(Date dakashijian) {
		this.dakashijian = dakashijian;
	}
	/**
	 * 获取：打卡时间
	 */
	public Date getDakashijian() {
		return dakashijian;
	}
	/**
	 * 设置：当前温度
	 */
	public void setDangqianwendu(Integer dangqianwendu) {
		this.dangqianwendu = dangqianwendu;
	}
	/**
	 * 获取：当前温度
	 */
	public Integer getDangqianwendu() {
		return dangqianwendu;
	}
	/**
	 * 设置：是否不适
	 */
	public void setShifoubushi(String shifoubushi) {
		this.shifoubushi = shifoubushi;
	}
	/**
	 * 获取：是否不适
	 */
	public String getShifoubushi() {
		return shifoubushi;
	}
	/**
	 * 设置：是否就医
	 */
	public void setShifoujiuyi(String shifoujiuyi) {
		this.shifoujiuyi = shifoujiuyi;
	}
	/**
	 * 获取：是否就医
	 */
	public String getShifoujiuyi() {
		return shifoujiuyi;
	}
	/**
	 * 设置：其他情况
	 */
	public void setQitaqingkuang(String qitaqingkuang) {
		this.qitaqingkuang = qitaqingkuang;
	}
	/**
	 * 获取：其他情况
	 */
	public String getQitaqingkuang() {
		return qitaqingkuang;
	}

}
