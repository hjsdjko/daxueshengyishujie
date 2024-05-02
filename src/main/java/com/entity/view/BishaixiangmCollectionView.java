package com.entity.view;

import com.entity.BishaixiangmCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 比赛项目收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("bishaixiangm_collection")
public class BishaixiangmCollectionView extends BishaixiangmCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 bishaixiangm
			/**
			* 比赛项目
			*/
			private String bishaixiangmName;
			/**
			* 比赛类型
			*/
			private Integer bishaixiangmTypes;
				/**
				* 比赛类型的值
				*/
				private String bishaixiangmValue;
			/**
			* 报名人数
			*/
			private Integer bishaixiangmNumber;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 结束报名时间
			*/
			private Date bishaixiangmTime;
			/**
			* 预览图
			*/
			private String bishaixiangmPhoto;
			/**
			* 比赛规则
			*/
			private String bishaixiangmContent;
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

	public BishaixiangmCollectionView() {

	}

	public BishaixiangmCollectionView(BishaixiangmCollectionEntity bishaixiangmCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, bishaixiangmCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}






















				//级联表的get和set bishaixiangm
					/**
					* 获取： 比赛项目
					*/
					public String getBishaixiangmName() {
						return bishaixiangmName;
					}
					/**
					* 设置： 比赛项目
					*/
					public void setBishaixiangmName(String bishaixiangmName) {
						this.bishaixiangmName = bishaixiangmName;
					}
					/**
					* 获取： 比赛类型
					*/
					public Integer getBishaixiangmTypes() {
						return bishaixiangmTypes;
					}
					/**
					* 设置： 比赛类型
					*/
					public void setBishaixiangmTypes(Integer bishaixiangmTypes) {
						this.bishaixiangmTypes = bishaixiangmTypes;
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
					/**
					* 获取： 报名人数
					*/
					public Integer getBishaixiangmNumber() {
						return bishaixiangmNumber;
					}
					/**
					* 设置： 报名人数
					*/
					public void setBishaixiangmNumber(Integer bishaixiangmNumber) {
						this.bishaixiangmNumber = bishaixiangmNumber;
					}
					/**
					* 获取： 结束报名时间
					*/
					public Date getBishaixiangmTime() {
						return bishaixiangmTime;
					}
					/**
					* 设置： 结束报名时间
					*/
					public void setBishaixiangmTime(Date bishaixiangmTime) {
						this.bishaixiangmTime = bishaixiangmTime;
					}
					/**
					* 获取： 预览图
					*/
					public String getBishaixiangmPhoto() {
						return bishaixiangmPhoto;
					}
					/**
					* 设置： 预览图
					*/
					public void setBishaixiangmPhoto(String bishaixiangmPhoto) {
						this.bishaixiangmPhoto = bishaixiangmPhoto;
					}
					/**
					* 获取： 比赛规则
					*/
					public String getBishaixiangmContent() {
						return bishaixiangmContent;
					}
					/**
					* 设置： 比赛规则
					*/
					public void setBishaixiangmContent(String bishaixiangmContent) {
						this.bishaixiangmContent = bishaixiangmContent;
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
