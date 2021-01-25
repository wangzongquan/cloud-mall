package com.cloud.mall.admin.dao;

import com.cloud.mall.admin.domain.People;
import com.cloud.mall.model.PmsProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsProductDao extends JpaRepository<PmsProduct,Long> {

}
