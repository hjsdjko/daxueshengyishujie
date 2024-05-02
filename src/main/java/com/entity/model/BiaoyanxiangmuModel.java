package com.entity.model;

import com.entity.BiaoyanxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 表演项目
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-26
 */
public class BiaoyanxiangmuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 表演项目
     */
    private String biaoyanxiangmuName;


    /**
     * 表演类型
     */
    private Integer biaoyanxiangmuTypes;


    /**
     * 报名人数
     */
    private Integer biaoyanxiangmuNumber;


    /**
     * 结束报名时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date biaoyanxiangmuTime;


    /**
     * 预览图
     */
    private String biaoyanxiangmuPhoto;


    /**
     * 表演规则
     */
    private String biaoyanxiangmuContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：表演项目
	 */
    public String getBiaoyanxiangmuName() {
        return biaoyanxiangmuName;
    }


    /**
	 * 设置：表演项目
	 */
    public void setBiaoyanxiangmuName(String biaoyanxiangmuName) {
        this.biaoyanxiangmuName = biaoyanxiangmuName;
    }
    /**
	 * 获取：表演类型
	 */
    public Integer getBiaoyanxiangmuTypes() {
        return biaoyanxiangmuTypes;
    }


    /**
	 * 设置：表演类型
	 */
    public void setBiaoyanxiangmuTypes(Integer biaoyanxiangmuTypes) {
        this.biaoyanxiangmuTypes = biaoyanxiangmuTypes;
    }
    /**
	 * 获取：报名人数
	 */
    public Integer getBiaoyanxiangmuNumber() {
        return biaoyanxiangmuNumber;
    }


    /**
	 * 设置：报名人数
	 */
    public void setBiaoyanxiangmuNumber(Integer biaoyanxiangmuNumber) {
        this.biaoyanxiangmuNumber = biaoyanxiangmuNumber;
    }
    /**
	 * 获取：结束报名时间
	 */
    public Date getBiaoyanxiangmuTime() {
        return biaoyanxiangmuTime;
    }


    /**
	 * 设置：结束报名时间
	 */
    public void setBiaoyanxiangmuTime(Date biaoyanxiangmuTime) {
        this.biaoyanxiangmuTime = biaoyanxiangmuTime;
    }
    /**
	 * 获取：预览图
	 */
    public String getBiaoyanxiangmuPhoto() {
        return biaoyanxiangmuPhoto;
    }


    /**
	 * 设置：预览图
	 */
    public void setBiaoyanxiangmuPhoto(String biaoyanxiangmuPhoto) {
        this.biaoyanxiangmuPhoto = biaoyanxiangmuPhoto;
    }
    /**
	 * 获取：表演规则
	 */
    public String getBiaoyanxiangmuContent() {
        return biaoyanxiangmuContent;
    }


    /**
	 * 设置：表演规则
	 */
    public void setBiaoyanxiangmuContent(String biaoyanxiangmuContent) {
        this.biaoyanxiangmuContent = biaoyanxiangmuContent;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
