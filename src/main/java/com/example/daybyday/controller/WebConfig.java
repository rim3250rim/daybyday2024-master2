package com.example.daybyday.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 'file:///C:/imgs/'는 로컬 파일 시스템의 경로를 나타냅니다.
        // '/images/**'는 URL 경로를 나타냅니다.
        registry.addResourceHandler("/imgs/**").addResourceLocations("file:///C:/imgs");
    }
}