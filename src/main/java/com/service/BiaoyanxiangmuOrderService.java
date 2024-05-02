package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BiaoyanxiangmuOrderEntity;
import java.util.Map;

/**
 * 表演项目报名模块 服务类
 * @author 
 * @since 2021-04-26
 */
public interface BiaoyanxiangmuOrderService extends IService<BiaoyanxiangmuOrderEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}