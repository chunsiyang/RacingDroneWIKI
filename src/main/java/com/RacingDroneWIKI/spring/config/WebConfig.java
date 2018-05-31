package com.RacingDroneWIKI.spring.config;


import org.springframework.context.annotation.*;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.io.IOException;


/**
 * The type Web config.
 * SpringMVC 核心配置
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Configuration
@ImportResource("classpath:spring/dataSource.xml")
@EnableWebMvc
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = "com.RacingDroneWIKI")
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * View resolver view resolver.
     *
     * @return the view resolver
     */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/");
        internalResourceViewResolver.setSuffix(".jsp");
        internalResourceViewResolver.setExposeContextBeansAsAttributes(true);
        return internalResourceViewResolver;
    }

    /**
     * Multipart resolver multipart resolver.
     *
     * @return the multipart resolver
     * @throws IOException the io exception
     */
    @Bean
    public MultipartResolver multipartResolver() throws IOException {
        return new StandardServletMultipartResolver();
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
