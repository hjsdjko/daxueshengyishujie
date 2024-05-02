package com.entity.model;

import com.entity.JieqianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 节前信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-26
 */
public class JieqianxinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String jieqianxinxiName;


    /**
     * 图片
     */
    private String jieqianxinxiPhoto;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 详情内容
     */
    private String jieqianxinxiContent;


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
	 * 获取：标题
	 */
    public String getJieqianxinxiName() {
        return jieqianxinxiName;
    }


    /**
	 * 设置：标题
	 */
    public void setJieqianxinxiName(String jieqianxinxiName) {
        this.jieqianxinxiName = jieqianxinxiName;
    }
    /**
	 * 获取：图片
	 */
    public String getJieqianxinxiPhoto() {
        return jieqianxinxiPhoto;
    }


    /**
	 * 设置：图片
	 */
    public void setJieqianxinxiPhoto(String jieqianxinxiPhoto) {
        this.jieqianxinxiPhoto = jieqianxinxiPhoto;
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
	 * 获取：详情内容
	 */
    public String getJieqianxinxiContent() {
        return jieqianxinxiContent;
    }


    /**
	 * 设置：详情内容
	 */
    public void setJieqianxinxiContent(String jieqianxinxiContent) {
        this.jieqianxinxiContent = jieqianxinxiContent;
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
