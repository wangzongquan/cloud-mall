package com.cloud.mall.admin.config;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(value = "com.cloud.mall.model")//引用其他模块的实体要用此配置，jpa才能扫描到
public class JpaEntityConfiguration {

}
