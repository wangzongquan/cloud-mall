package com.cloud.mall.admin.controller;

import com.cloud.mall.admin.dao.PmsProductDao;
import com.cloud.mall.admin.service.PmsProductService;
import com.cloud.mall.model.PmsProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangzongquan
 * @since 2021-01-28
 * 商品控制器类
 */
@RestController
@RequestMapping("/pms")
public class PmsProductController {

    @Autowired
    private PmsProductService pmsProductService;

    @RequestMapping("/getProductList")
    public Map<String,Object> getProductList(@RequestParam(value = "pageSize",defaultValue = "10") String pageSize,
                                                 @RequestParam(value = "pageNum",defaultValue = "1") String pageNum,
                                             String name){
        Page<PmsProduct> page = pmsProductService.findList(pageSize,pageNum,name);
        List<PmsProduct> productList = page.getContent();
        Long total = page.getTotalElements();
        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("total",total);
        dataMap.put("items",productList);
        return dataMap;
    }
}
