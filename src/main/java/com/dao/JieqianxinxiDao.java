package com.dao;

import com.entity.JieqianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JieqianxinxiView;

/**
 * 节前信息 Dao 接口
 *
 * @author 
 * @since 2021-04-26
 */
public interface JieqianxinxiDao extends BaseMapper<JieqianxinxiEntity> {

   List<JieqianxinxiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
