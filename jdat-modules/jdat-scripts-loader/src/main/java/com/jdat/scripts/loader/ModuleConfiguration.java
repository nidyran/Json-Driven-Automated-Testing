package com.jdat.scripts.loader;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author nidhal.ben-yarou
 */
@Configuration
@ComponentScan(basePackageClasses = ModuleConfiguration.class)
public class ModuleConfiguration {
}
