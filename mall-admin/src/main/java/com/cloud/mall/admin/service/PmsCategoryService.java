package com.cloud.mall.admin.service;

import com.cloud.mall.admin.dao.PmsCategoryDao;
import com.cloud.mall.model.PmsProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangzongquan
 * @since 2021-02-02
 * 商品类别service
 */
@Service
public class PmsCategoryService {
    @Autowired
    private PmsCategoryDao pmsCategoryDao;

    public List<PmsProductCategory> getCategoryList(){
        return pmsCategoryDao.selectByPid(0L);
    }
}
