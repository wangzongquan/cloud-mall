package com.cloud.mall.admin.controller;

import com.cloud.mall.admin.dao.PmsProductDao;
import com.cloud.mall.admin.service.PmsProductService;
import com.cloud.mall.model.PmsProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pms")
public class PmsProductController {

    @Autowired
    private PmsProductService pmsProductService;

    @RequestMapping("/getProductList")
    public Page<PmsProduct> getProductList(@RequestParam(value = "pageSize",defaultValue = "10") String pageSize,
                                                 @RequestParam(value = "pageNum",defaultValue = "1") String pageNum){
        return pmsProductService.findList(pageSize,pageNum);
    }
}
