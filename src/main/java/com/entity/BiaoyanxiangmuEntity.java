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
 * 表演项目
 *
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("biaoyanxiangmu")
public class BiaoyanxiangmuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BiaoyanxiangmuEntity() {

	}

	public BiaoyanxiangmuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 表演项目
     */
    @TableField(value = "biaoyanxiangmu_name")

    private String biaoyanxiangmuName;


    /**
     * 表演类型
     */
    @TableField(value = "biaoyanxiangmu_types")

    private Integer biaoyanxiangmuTypes;


    /**
     * 报名人数
     */
    @TableField(value = "biaoyanxiangmu_number")

    private Integer biaoyanxiangmuNumber;


    /**
     * 结束报名时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "biaoyanxiangmu_time",fill = FieldFill.UPDATE)

    private Date biaoyanxiangmuTime;


    /**
     * 预览图
     */
    @TableField(value = "biaoyanxiangmu_photo")

    private String biaoyanxiangmuPhoto;


    /**
     * 表演规则
     */
    @TableField(value = "biaoyanxiangmu_content")

    private String biaoyanxiangmuContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：表演项目
	 */
    public String getBiaoyanxiangmuName() {
        return biaoyanxiangmuName;
    }


    /**
	 * 获取：表演项目
	 */

    public void setBiaoyanxiangmuName(String biaoyanxiangmuName) {
        this.biaoyanxiangmuName = biaoyanxiangmuName;
    }
    /**
	 * 设置：表演类型
	 */
    public Integer getBiaoyanxiangmuTypes() {
        return biaoyanxiangmuTypes;
    }


    /**
	 * 获取：表演类型
	 */

    public void setBiaoyanxiangmuTypes(Integer biaoyanxiangmuTypes) {
        this.biaoyanxiangmuTypes = biaoyanxiangmuTypes;
    }
    /**
	 * 设置：报名人数
	 */
    public Integer getBiaoyanxiangmuNumber() {
        return biaoyanxiangmuNumber;
    }


    /**
	 * 获取：报名人数
	 */

    public void setBiaoyanxiangmuNumber(Integer biaoyanxiangmuNumber) {
        this.biaoyanxiangmuNumber = biaoyanxiangmuNumber;
    }
    /**
	 * 设置：结束报名时间
	 */
    public Date getBiaoyanxiangmuTime() {
        return biaoyanxiangmuTime;
    }


    /**
	 * 获取：结束报名时间
	 */

    public void setBiaoyanxiangmuTime(Date biaoyanxiangmuTime) {
        this.biaoyanxiangmuTime = biaoyanxiangmuTime;
    }
    /**
	 * 设置：预览图
	 */
    public String getBiaoyanxiangmuPhoto() {
        return biaoyanxiangmuPhoto;
    }


    /**
	 * 获取：预览图
	 */

    public void setBiaoyanxiangmuPhoto(String biaoyanxiangmuPhoto) {
        this.biaoyanxiangmuPhoto = biaoyanxiangmuPhoto;
    }
    /**
	 * 设置：表演规则
	 */
    public String getBiaoyanxiangmuContent() {
        return biaoyanxiangmuContent;
    }


    /**
	 * 获取：表演规则
	 */

    public void setBiaoyanxiangmuContent(String biaoyanxiangmuContent) {
        this.biaoyanxiangmuContent = biaoyanxiangmuContent;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Biaoyanxiangmu{" +
            "id=" + id +
            ", biaoyanxiangmuName=" + biaoyanxiangmuName +
            ", biaoyanxiangmuTypes=" + biaoyanxiangmuTypes +
            ", biaoyanxiangmuNumber=" + biaoyanxiangmuNumber +
            ", biaoyanxiangmuTime=" + biaoyanxiangmuTime +
            ", biaoyanxiangmuPhoto=" + biaoyanxiangmuPhoto +
            ", biaoyanxiangmuContent=" + biaoyanxiangmuContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
