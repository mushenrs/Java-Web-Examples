package me.mushen.javaweb.spitter.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Desc
 * @Author Remilia
 * @Create 2016-11-20
 */
@Configuration
@ComponentScan(
        basePackages = {"me.mushen.javaweb.spitter"},
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
        }
)
public class RootConfig {
}
