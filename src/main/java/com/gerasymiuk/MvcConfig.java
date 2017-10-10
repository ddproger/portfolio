package com.gerasymiuk;

import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.concurrent.TimeUnit;

/**
 * Created by gerasymiuk on 10.10.17.
 */
@EnableWebMvc
public class MvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**")
                .addResourceLocations("/js/")
                .setCacheControl(CacheControl.maxAge(1, TimeUnit.DAYS));
        registry.addResourceHandler("/stylesheets/**")
                .addResourceLocations("/stylesheets/")
                .setCacheControl(CacheControl.maxAge(1, TimeUnit.DAYS));
        registry.addResourceHandler("/img/**")
                .addResourceLocations("/img/")
                .setCacheControl(CacheControl.maxAge(1, TimeUnit.DAYS));
    }
}
