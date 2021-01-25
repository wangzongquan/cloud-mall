package com.cloud.mall.admin.controller;

import com.cloud.mall.admin.dao.PmsProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminCtrl {

    @Autowired
    private PmsProductDao pmsProductDao;

    @RequestMapping("/products")
    public String products(){
        return "success";
    }
}
