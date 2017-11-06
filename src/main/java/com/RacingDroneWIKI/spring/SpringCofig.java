package com.RacingDroneWIKI.spring;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by user on 2017/11/6.
 */
public class SpringCofig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootCofig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new  Class<?>[]{WebCofig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
