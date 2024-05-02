package com.entity.vo;

import com.entity.BiaoyanxiangmuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 表演项目
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("biaoyanxiangmu")
public class BiaoyanxiangmuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "biaoyanxiangmu_time")
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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
