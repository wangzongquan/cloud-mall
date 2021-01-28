package com.cloud.mall.admin.service;

import com.cloud.mall.admin.dao.PmsProductDao;
import com.cloud.mall.model.PmsProduct;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzongquan
 * @since 2021-01-25
 * 商品服务service
 */
@Service
public class PmsProductService {

    @Autowired
    private PmsProductDao productDao;

    public List<PmsProduct> findAllProduct(){
        return productDao.findAll();
    }

    /**
     * 商品分页查询
     * @param pageSize
     * @param pageNum
     * @param name
     * @return Page<PmsProduct>
     */
    public Page<PmsProduct> findList(String pageSize,String pageNum,String name){
        Specification<PmsProduct> specification = new Specification<PmsProduct>() {
            @Override
            public Predicate toPredicate(Root<PmsProduct> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>();
                if(StringUtils.isNotBlank(name)){
                    predicates.add(cb.equal(root.get("name").as(String.class),name));
                }
                Predicate[] p = new Predicate[predicates.size()];
                return cb.and(predicates.toArray(p));
            }
        };
        Pageable pageable = PageRequest.of(Integer.parseInt(pageNum)-1, Integer.parseInt(pageSize));
        return productDao.findAll(specification,pageable);
    }
}
