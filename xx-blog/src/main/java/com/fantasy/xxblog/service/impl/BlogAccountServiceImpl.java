package com.fantasy.xxblog.service.impl;

import com.fantasy.xxbase.dao.BaseDao;
import com.fantasy.xxbase.service.impl.BaseServiceImpl;
import com.fantasy.xxblog.entity.BlogAccountEntity;
import com.fantasy.xxblog.service.BlogAccountService;
import com.fantasy.xxcore.datasource.XXDynamicDataSource;
import com.fantasy.xxcore.datasource.XXDynamicDataSourceHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 17/02/17.
 */
@Service
@XXDynamicDataSource(XXDynamicDataSourceHolder.DATASOURCE_BLOG)
public class BlogAccountServiceImpl extends BaseServiceImpl<BlogAccountEntity> implements BlogAccountService {

    @Autowired
    public void setBaseDao(BaseDao<BlogAccountEntity> baseDao) {
        super.setBaseDao(baseDao);
    }
}
