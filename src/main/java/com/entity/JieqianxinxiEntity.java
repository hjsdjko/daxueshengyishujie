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
 * 节前信息
 *
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("jieqianxinxi")
public class JieqianxinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JieqianxinxiEntity() {

	}

	public JieqianxinxiEntity(T t) {
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 详情内容
     */
    @TableField(value = "jieqianxinxi_content")

    private String jieqianxinxiContent;


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
        return "Jieqianxinxi{" +
            "id=" + id +
            ", jieqianxinxiName=" + jieqianxinxiName +
            ", jieqianxinxiPhoto=" + jieqianxinxiPhoto +
            ", insertTime=" + insertTime +
            ", jieqianxinxiContent=" + jieqianxinxiContent +
            ", createTime=" + createTime +
        "}";
    }
}
