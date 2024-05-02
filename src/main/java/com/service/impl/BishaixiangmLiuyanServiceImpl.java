package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.BishaixiangmLiuyanDao;
import com.entity.BishaixiangmLiuyanEntity;
import com.service.BishaixiangmLiuyanService;
import com.entity.view.BishaixiangmLiuyanView;

/**
 * 比赛项目留言 服务实现类
 * @author 
 * @since 2021-04-26
 */
@Service("bishaixiangmLiuyanService")
@Transactional
public class BishaixiangmLiuyanServiceImpl extends ServiceImpl<BishaixiangmLiuyanDao, BishaixiangmLiuyanEntity> implements BishaixiangmLiuyanService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<BishaixiangmLiuyanView> page =new Query<BishaixiangmLiuyanView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
