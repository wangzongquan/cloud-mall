package com.cloud.mall.admin.controller;

/**
 * @author wangzongquan
 * @since 2021-02-02
 * 商品类别Controller
 */

import com.cloud.mall.admin.service.PmsCategoryService;
import com.cloud.mall.common.api.CommonResult;
import com.cloud.mall.model.PmsProductCategory;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "PmsProductCategoryController",value = "商品分类管理")
@RequestMapping("productCategory")
public class PmsProductCategoryController {

    @Autowired
    private PmsCategoryService pmsCategoryService;

    @RequestMapping("/list/withChildren")
    public CommonResult<List<PmsProductCategory>> getCategoryList(){
        List<PmsProductCategory> data = pmsCategoryService.getCategoryList();
        return CommonResult.success(data);
    }

}
