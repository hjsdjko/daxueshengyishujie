package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BishaixiangmOrderEntity;
import java.util.Map;

/**
 * 比赛项目报名模块 服务类
 * @author 
 * @since 2021-04-26
 */
public interface BishaixiangmOrderService extends IService<BishaixiangmOrderEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}