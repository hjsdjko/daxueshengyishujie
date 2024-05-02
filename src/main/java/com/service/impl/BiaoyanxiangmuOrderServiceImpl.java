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

import com.dao.BiaoyanxiangmuOrderDao;
import com.entity.BiaoyanxiangmuOrderEntity;
import com.service.BiaoyanxiangmuOrderService;
import com.entity.view.BiaoyanxiangmuOrderView;

/**
 * 表演项目报名模块 服务实现类
 * @author 
 * @since 2021-04-26
 */
@Service("biaoyanxiangmuOrderService")
@Transactional
public class BiaoyanxiangmuOrderServiceImpl extends ServiceImpl<BiaoyanxiangmuOrderDao, BiaoyanxiangmuOrderEntity> implements BiaoyanxiangmuOrderService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<BiaoyanxiangmuOrderView> page =new Query<BiaoyanxiangmuOrderView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
