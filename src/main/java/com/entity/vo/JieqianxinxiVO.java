package com.entity.vo;

import com.entity.JieqianxinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 节前信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("jieqianxinxi")
public class JieqianxinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "jieqianxinxi_name")
    private String jieqianxinxiName;


    /**
     * 图片
     */

    @TableField(value = "jieqianxinxi_photo")
    private String jieqianxinxiPhoto;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 详情内容
     */

    @TableField(value = "jieqianxinxi_content")
    private String jieqianxinxiContent;


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
	 * 设置：标题
	 */
    public String getJieqianxinxiName() {
        return jieqianxinxiName;
    }


    /**
	 * 获取：标题
	 */

    public void setJieqianxinxiName(String jieqianxinxiName) {
        this.jieqianxinxiName = jieqianxinxiName;
    }
    /**
	 * 设置：图片
	 */
    public String getJieqianxinxiPhoto() {
        return jieqianxinxiPhoto;
    }


    /**
	 * 获取：图片
	 */

    public void setJieqianxinxiPhoto(String jieqianxinxiPhoto) {
        this.jieqianxinxiPhoto = jieqianxinxiPhoto;
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
	 * 设置：详情内容
	 */
    public String getJieqianxinxiContent() {
        return jieqianxinxiContent;
    }


    /**
	 * 获取：详情内容
	 */

    public void setJieqianxinxiContent(String jieqianxinxiContent) {
        this.jieqianxinxiContent = jieqianxinxiContent;
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
