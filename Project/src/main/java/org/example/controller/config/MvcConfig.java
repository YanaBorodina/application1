package org.example.controller.config;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MvcConfig implements SecurityConfig {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/login").setViewName("login");
        registry.addRedirectViewController("/bookList").setViewName("bookList");
    }
}
