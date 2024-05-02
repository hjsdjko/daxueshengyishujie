package com.dao;

import com.entity.BiaoyanxiangmuLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BiaoyanxiangmuLiuyanView;

/**
 * 表演项目留言 Dao 接口
 *
 * @author 
 * @since 2021-04-26
 */
public interface BiaoyanxiangmuLiuyanDao extends BaseMapper<BiaoyanxiangmuLiuyanEntity> {

   List<BiaoyanxiangmuLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
