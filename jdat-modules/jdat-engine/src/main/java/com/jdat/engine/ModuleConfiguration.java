package com.jdat.engine;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author nidhal.ben-yarou
 */
@Configuration
@EnableScheduling
@ComponentScan(basePackageClasses = ModuleConfiguration.class)
public class ModuleConfiguration {
}
