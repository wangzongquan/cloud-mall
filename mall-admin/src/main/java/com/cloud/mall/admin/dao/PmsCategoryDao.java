package com.cloud.mall.admin.dao;

import com.cloud.mall.model.PmsProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.NamedQuery;
import java.util.List;

/**
 * @author wangzongquan
 * @since 2021-02-02
 * 商品类别dao
 */
public interface PmsCategoryDao extends JpaRepository<PmsProductCategory,Long> {

    @Query("select c from PmsProductCategory c where c.parentId=?1")
    public List<PmsProductCategory> selectByPid(@Param("parentId") Long parentId);
}
