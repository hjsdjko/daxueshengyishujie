package com.entity.model;

import com.entity.BishaijieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 比赛结果
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-26
 */
public class BishaijieguoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 比赛项目
     */
    private Integer bishaixiangmId;


    /**
     * 比赛结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date bishaijieguoTime;


    /**
     * 比赛结果
     */
    private String biaoyanxiangmuBisaijieguo;


    /**
     * 创建时间
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
    public Integer getBishaixiangmId() {
        return bishaixiangmId;
    }


    /**
	 * 设置：比赛项目
	 */
    public void setBishaixiangmId(Integer bishaixiangmId) {
        this.bishaixiangmId = bishaixiangmId;
    }
    /**
	 * 获取：比赛结束时间
	 */
    public Date getBishaijieguoTime() {
        return bishaijieguoTime;
    }


    /**
	 * 设置：比赛结束时间
	 */
    public void setBishaijieguoTime(Date bishaijieguoTime) {
        this.bishaijieguoTime = bishaijieguoTime;
    }
    /**
	 * 获取：比赛结果
	 */
    public String getBiaoyanxiangmuBisaijieguo() {
        return biaoyanxiangmuBisaijieguo;
    }


    /**
	 * 设置：比赛结果
	 */
    public void setBiaoyanxiangmuBisaijieguo(String biaoyanxiangmuBisaijieguo) {
        this.biaoyanxiangmuBisaijieguo = biaoyanxiangmuBisaijieguo;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
