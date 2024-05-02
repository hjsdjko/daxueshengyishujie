package com.dao;

import com.entity.BiaoyanxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BiaoyanxiangmuView;

/**
 * 表演项目 Dao 接口
 *
 * @author 
 * @since 2021-04-26
 */
public interface BiaoyanxiangmuDao extends BaseMapper<BiaoyanxiangmuEntity> {

   List<BiaoyanxiangmuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
