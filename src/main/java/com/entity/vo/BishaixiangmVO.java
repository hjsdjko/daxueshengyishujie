package com.entity.vo;

import com.entity.BishaixiangmEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 比赛项目
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("bishaixiangm")
public class BishaixiangmVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 比赛项目
     */

    @TableField(value = "bishaixiangm_name")
    private String bishaixiangmName;


    /**
     * 比赛类型
     */

    @TableField(value = "bishaixiangm_types")
    private Integer bishaixiangmTypes;


    /**
     * 报名人数
     */

    @TableField(value = "bishaixiangm_number")
    private Integer bishaixiangmNumber;


    /**
     * 结束报名时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "bishaixiangm_time")
    private Date bishaixiangmTime;


    /**
     * 预览图
     */

    @TableField(value = "bishaixiangm_photo")
    private String bishaixiangmPhoto;


    /**
     * 比赛规则
     */

    @TableField(value = "bishaixiangm_content")
    private String bishaixiangmContent;


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
	 * 设置：比赛项目
	 */
    public String getBishaixiangmName() {
        return bishaixiangmName;
    }


    /**
	 * 获取：比赛项目
	 */

    public void setBishaixiangmName(String bishaixiangmName) {
        this.bishaixiangmName = bishaixiangmName;
    }
    /**
	 * 设置：比赛类型
	 */
    public Integer getBishaixiangmTypes() {
        return bishaixiangmTypes;
    }


    /**
	 * 获取：比赛类型
	 */

    public void setBishaixiangmTypes(Integer bishaixiangmTypes) {
        this.bishaixiangmTypes = bishaixiangmTypes;
    }
    /**
	 * 设置：报名人数
	 */
    public Integer getBishaixiangmNumber() {
        return bishaixiangmNumber;
    }


    /**
	 * 获取：报名人数
	 */

    public void setBishaixiangmNumber(Integer bishaixiangmNumber) {
        this.bishaixiangmNumber = bishaixiangmNumber;
    }
    /**
	 * 设置：结束报名时间
	 */
    public Date getBishaixiangmTime() {
        return bishaixiangmTime;
    }


    /**
	 * 获取：结束报名时间
	 */

    public void setBishaixiangmTime(Date bishaixiangmTime) {
        this.bishaixiangmTime = bishaixiangmTime;
    }
    /**
	 * 设置：预览图
	 */
    public String getBishaixiangmPhoto() {
        return bishaixiangmPhoto;
    }


    /**
	 * 获取：预览图
	 */

    public void setBishaixiangmPhoto(String bishaixiangmPhoto) {
        this.bishaixiangmPhoto = bishaixiangmPhoto;
    }
    /**
	 * 设置：比赛规则
	 */
    public String getBishaixiangmContent() {
        return bishaixiangmContent;
    }


    /**
	 * 获取：比赛规则
	 */

    public void setBishaixiangmContent(String bishaixiangmContent) {
        this.bishaixiangmContent = bishaixiangmContent;
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
