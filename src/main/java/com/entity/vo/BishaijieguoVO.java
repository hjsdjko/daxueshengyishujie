package com.entity.vo;

import com.entity.BishaijieguoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 比赛结果
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-26
 */
@TableName("bishaijieguo")
public class BishaijieguoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "bishaijieguo_time")
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

}
