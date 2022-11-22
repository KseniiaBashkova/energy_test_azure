package cz.mpsv.energy.energydatastorage.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * This enables the /specifications/** endpoint for all files from resources/specifications folder
 */
@Configuration
public class StaticSpecificationConfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/specifications/**").addResourceLocations("classpath:/specifications/");
    }
}