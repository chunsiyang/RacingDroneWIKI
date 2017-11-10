package com.RacingDroneWIKI.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by user on 2017/11/6.
 */

@Configuration
@ImportResource("classpath:spring/spring-mybatis.xml")
@ComponentScan(basePackages = "com.RacingDroneWIKI",
excludeFilters={@ComponentScan.Filter(type= FilterType.ANNOTATION,value=EnableWebMvc.class)})
public class RootConfig {
}
