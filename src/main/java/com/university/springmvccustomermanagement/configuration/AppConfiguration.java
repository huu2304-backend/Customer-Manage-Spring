package com.university.springmvccustomermanagement.configuration;

import com.university.springmvccustomermanagement.service.CustomerService;
import com.university.springmvccustomermanagement.service.impl.SimpleCustomerServiceImpl;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configurable
@EnableWebMvc
@ComponentScan(basePackages = {"com.university.springmvccustomermanagement"})
public class AppConfiguration implements WebMvcConfigurer {
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/customers/z");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
    @Bean
    public CustomerService customerService() {
        return new SimpleCustomerServiceImpl();
    }
}
