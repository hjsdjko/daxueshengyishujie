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
 * 比赛结果
 *
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("bishaijieguo")
public class BishaijieguoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BishaijieguoEntity() {

	}

	public BishaijieguoEntity(T t) {
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
     * 比赛项目
     */
    @TableField(value = "bishaixiangm_id")

    private Integer bishaixiangmId;


    /**
     * 比赛结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "bishaijieguo_time",fill = FieldFill.UPDATE)

    private Date bishaijieguoTime;


    /**
     * 比赛结果
     */
    @TableField(value = "biaoyanxiangmu_bisaijieguo")

    private String biaoyanxiangmuBisaijieguo;


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
	 * 设置：比赛项目
	 */
    public Integer getBishaixiangmId() {
        return bishaixiangmId;
    }


    /**
	 * 获取：比赛项目
	 */

    public void setBishaixiangmId(Integer bishaixiangmId) {
        this.bishaixiangmId = bishaixiangmId;
    }
    /**
	 * 设置：比赛结束时间
	 */
    public Date getBishaijieguoTime() {
        return bishaijieguoTime;
    }


    /**
	 * 获取：比赛结束时间
	 */

    public void setBishaijieguoTime(Date bishaijieguoTime) {
        this.bishaijieguoTime = bishaijieguoTime;
    }
    /**
	 * 设置：比赛结果
	 */
    public String getBiaoyanxiangmuBisaijieguo() {
        return biaoyanxiangmuBisaijieguo;
    }


    /**
	 * 获取：比赛结果
	 */

    public void setBiaoyanxiangmuBisaijieguo(String biaoyanxiangmuBisaijieguo) {
        this.biaoyanxiangmuBisaijieguo = biaoyanxiangmuBisaijieguo;
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
        return "Bishaijieguo{" +
            "id=" + id +
            ", bishaixiangmId=" + bishaixiangmId +
            ", bishaijieguoTime=" + bishaijieguoTime +
            ", biaoyanxiangmuBisaijieguo=" + biaoyanxiangmuBisaijieguo +
            ", createTime=" + createTime +
        "}";
    }
}
