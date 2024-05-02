package com.entity.view;

import com.entity.BiaoyanxiangmuCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 表演项目收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("biaoyanxiangmu_collection")
public class BiaoyanxiangmuCollectionView extends BiaoyanxiangmuCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 biaoyanxiangmu
			/**
			* 表演项目
			*/
			private String biaoyanxiangmuName;
			/**
			* 表演类型
			*/
			private Integer biaoyanxiangmuTypes;
				/**
				* 表演类型的值
				*/
				private String biaoyanxiangmuValue;
			/**
			* 报名人数
			*/
			private Integer biaoyanxiangmuNumber;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 结束报名时间
			*/
			private Date biaoyanxiangmuTime;
			/**
			* 预览图
			*/
			private String biaoyanxiangmuPhoto;
			/**
			* 表演规则
			*/
			private String biaoyanxiangmuContent;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 发布时间
			*/
			private Date insertTime;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public BiaoyanxiangmuCollectionView() {

	}

	public BiaoyanxiangmuCollectionView(BiaoyanxiangmuCollectionEntity biaoyanxiangmuCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, biaoyanxiangmuCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}







				//级联表的get和set biaoyanxiangmu
					/**
					* 获取： 表演项目
					*/
					public String getBiaoyanxiangmuName() {
						return biaoyanxiangmuName;
					}
					/**
					* 设置： 表演项目
					*/
					public void setBiaoyanxiangmuName(String biaoyanxiangmuName) {
						this.biaoyanxiangmuName = biaoyanxiangmuName;
					}
					/**
					* 获取： 表演类型
					*/
					public Integer getBiaoyanxiangmuTypes() {
						return biaoyanxiangmuTypes;
					}
					/**
					* 设置： 表演类型
					*/
					public void setBiaoyanxiangmuTypes(Integer biaoyanxiangmuTypes) {
						this.biaoyanxiangmuTypes = biaoyanxiangmuTypes;
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
					/**
					* 获取： 报名人数
					*/
					public Integer getBiaoyanxiangmuNumber() {
						return biaoyanxiangmuNumber;
					}
					/**
					* 设置： 报名人数
					*/
					public void setBiaoyanxiangmuNumber(Integer biaoyanxiangmuNumber) {
						this.biaoyanxiangmuNumber = biaoyanxiangmuNumber;
					}
					/**
					* 获取： 结束报名时间
					*/
					public Date getBiaoyanxiangmuTime() {
						return biaoyanxiangmuTime;
					}
					/**
					* 设置： 结束报名时间
					*/
					public void setBiaoyanxiangmuTime(Date biaoyanxiangmuTime) {
						this.biaoyanxiangmuTime = biaoyanxiangmuTime;
					}
					/**
					* 获取： 预览图
					*/
					public String getBiaoyanxiangmuPhoto() {
						return biaoyanxiangmuPhoto;
					}
					/**
					* 设置： 预览图
					*/
					public void setBiaoyanxiangmuPhoto(String biaoyanxiangmuPhoto) {
						this.biaoyanxiangmuPhoto = biaoyanxiangmuPhoto;
					}
					/**
					* 获取： 表演规则
					*/
					public String getBiaoyanxiangmuContent() {
						return biaoyanxiangmuContent;
					}
					/**
					* 设置： 表演规则
					*/
					public void setBiaoyanxiangmuContent(String biaoyanxiangmuContent) {
						this.biaoyanxiangmuContent = biaoyanxiangmuContent;
					}
					/**
					* 获取： 发布时间
					*/
					public Date getInsertTime() {
						return insertTime;
					}
					/**
					* 设置： 发布时间
					*/
					public void setInsertTime(Date insertTime) {
						this.insertTime = insertTime;
					}





































				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}



}
