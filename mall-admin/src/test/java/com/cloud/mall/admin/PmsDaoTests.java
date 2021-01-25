package com.cloud.mall.admin;

import com.cloud.mall.admin.dao.PmsProductDao;
import com.cloud.mall.admin.service.PmsProductService;
import com.cloud.mall.model.PmsProduct;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PmsDaoTests {
    @Autowired
    private PmsProductDao pmsProductDao;

    @Autowired
    private PmsProductService pmsProductService;

    @Test
    @Transactional
    public void testPeople(){
        List<PmsProduct> products = pmsProductDao.findAll();
        for(PmsProduct product:products){
            System.out.println(product);
        }
    }

    @Test
    public void testService(){

    }
}
