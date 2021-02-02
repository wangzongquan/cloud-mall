package com.cloud.mall.admin;

import com.cloud.mall.admin.service.PmsCategoryService;
import com.cloud.mall.model.PmsProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PmsCategoryServcieTest {
    @Autowired
    PmsCategoryService pmsCategoryService;
    @Test
    @Transactional
    public void testGetCategories(){
        List<PmsProductCategory> categories = pmsCategoryService.getCategoryList();
        for (PmsProductCategory category:categories){
            System.out.println(category.getName());
            List<PmsProductCategory> childrens = category.getChildren();
            for(PmsProductCategory children:childrens)
                System.out.println(children.getName());
        }
    }
}
