package com.entity.view;

import com.entity.BishaixiangmEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 比赛项目
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("bishaixiangm")
public class BishaixiangmView extends BishaixiangmEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 比赛类型的值
		*/
		private String bishaixiangmValue;



	public BishaixiangmView() {

	}

	public BishaixiangmView(BishaixiangmEntity bishaixiangmEntity) {
		try {
			BeanUtils.copyProperties(this, bishaixiangmEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 比赛类型的值
			*/
			public String getBishaixiangmValue() {
				return bishaixiangmValue;
			}
			/**
			* 设置： 比赛类型的值
			*/
			public void setBishaixiangmValue(String bishaixiangmValue) {
				this.bishaixiangmValue = bishaixiangmValue;
			}
















}
