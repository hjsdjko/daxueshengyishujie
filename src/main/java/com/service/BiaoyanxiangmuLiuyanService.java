package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BiaoyanxiangmuLiuyanEntity;
import java.util.Map;

/**
 * 表演项目留言 服务类
 * @author 
 * @since 2021-04-26
 */
public interface BiaoyanxiangmuLiuyanService extends IService<BiaoyanxiangmuLiuyanEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}