package com.cloud.mall.admin.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class GlobalCorsConfigMvc implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .maxAge(3600)
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "DELETE", "PUT");
    }
}
