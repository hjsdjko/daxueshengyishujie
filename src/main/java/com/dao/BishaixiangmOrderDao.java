package com.dao;

import com.entity.BishaixiangmOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BishaixiangmOrderView;

/**
 * 比赛项目报名模块 Dao 接口
 *
 * @author 
 * @since 2021-04-26
 */
public interface BishaixiangmOrderDao extends BaseMapper<BishaixiangmOrderEntity> {

   List<BishaixiangmOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
