package com.dao;

import com.entity.BishaixiangmLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BishaixiangmLiuyanView;

/**
 * 比赛项目留言 Dao 接口
 *
 * @author 
 * @since 2021-04-26
 */
public interface BishaixiangmLiuyanDao extends BaseMapper<BishaixiangmLiuyanEntity> {

   List<BishaixiangmLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
