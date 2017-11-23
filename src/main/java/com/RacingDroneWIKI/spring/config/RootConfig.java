package com.RacingDroneWIKI.spring.config;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * The type Root config.
 * Spring 核心配置
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Configuration
@ImportResource("classpath:spring/spring-mybatis.xml")
@ComponentScan(basePackages = "com.RacingDroneWIKI",
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {
}
