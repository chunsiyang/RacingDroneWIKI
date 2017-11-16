package com.RacingDroneWIKI.spring.config;

import org.springframework.context.annotation.*;
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
