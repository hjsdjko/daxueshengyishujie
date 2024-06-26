package com.entity.view;

import com.entity.BiaoyanxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 表演项目
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("biaoyanxiangmu")
public class BiaoyanxiangmuView extends BiaoyanxiangmuEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 表演类型的值
		*/
		private String biaoyanxiangmuValue;



	public BiaoyanxiangmuView() {

	}

	public BiaoyanxiangmuView(BiaoyanxiangmuEntity biaoyanxiangmuEntity) {
		try {
			BeanUtils.copyProperties(this, biaoyanxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 表演类型的值
			*/
			public String getBiaoyanxiangmuValue() {
				return biaoyanxiangmuValue;
			}
			/**
			* 设置： 表演类型的值
			*/
			public void setBiaoyanxiangmuValue(String biaoyanxiangmuValue) {
				this.biaoyanxiangmuValue = biaoyanxiangmuValue;
			}
















}
