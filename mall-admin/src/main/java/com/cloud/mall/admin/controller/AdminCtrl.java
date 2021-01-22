package com.cloud.mall.admin.controller;

import com.cloud.mall.admin.config.DataBaseConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminCtrl {

    @Autowired
    private DataBaseConfiguration configuration;

    @RequestMapping("/getConfig")
    public String getConfig(){
        System.out.println(configuration.getUrl());
        return "success";
    }
}
