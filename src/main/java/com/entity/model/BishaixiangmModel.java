package com.entity.model;

import com.entity.BishaixiangmEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 比赛项目
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-26
 */
public class BishaixiangmModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 比赛项目
     */
    private String bishaixiangmName;


    /**
     * 比赛类型
     */
    private Integer bishaixiangmTypes;


    /**
     * 报名人数
     */
    private Integer bishaixiangmNumber;


    /**
     * 结束报名时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date bishaixiangmTime;


    /**
     * 预览图
     */
    private String bishaixiangmPhoto;


    /**
     * 比赛规则
     */
    private String bishaixiangmContent;


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
	 * 获取：比赛项目
	 */
    public String getBishaixiangmName() {
        return bishaixiangmName;
    }


    /**
	 * 设置：比赛项目
	 */
    public void setBishaixiangmName(String bishaixiangmName) {
        this.bishaixiangmName = bishaixiangmName;
    }
    /**
	 * 获取：比赛类型
	 */
    public Integer getBishaixiangmTypes() {
        return bishaixiangmTypes;
    }


    /**
	 * 设置：比赛类型
	 */
    public void setBishaixiangmTypes(Integer bishaixiangmTypes) {
        this.bishaixiangmTypes = bishaixiangmTypes;
    }
    /**
	 * 获取：报名人数
	 */
    public Integer getBishaixiangmNumber() {
        return bishaixiangmNumber;
    }


    /**
	 * 设置：报名人数
	 */
    public void setBishaixiangmNumber(Integer bishaixiangmNumber) {
        this.bishaixiangmNumber = bishaixiangmNumber;
    }
    /**
	 * 获取：结束报名时间
	 */
    public Date getBishaixiangmTime() {
        return bishaixiangmTime;
    }


    /**
	 * 设置：结束报名时间
	 */
    public void setBishaixiangmTime(Date bishaixiangmTime) {
        this.bishaixiangmTime = bishaixiangmTime;
    }
    /**
	 * 获取：预览图
	 */
    public String getBishaixiangmPhoto() {
        return bishaixiangmPhoto;
    }


    /**
	 * 设置：预览图
	 */
    public void setBishaixiangmPhoto(String bishaixiangmPhoto) {
        this.bishaixiangmPhoto = bishaixiangmPhoto;
    }
    /**
	 * 获取：比赛规则
	 */
    public String getBishaixiangmContent() {
        return bishaixiangmContent;
    }


    /**
	 * 设置：比赛规则
	 */
    public void setBishaixiangmContent(String bishaixiangmContent) {
        this.bishaixiangmContent = bishaixiangmContent;
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
