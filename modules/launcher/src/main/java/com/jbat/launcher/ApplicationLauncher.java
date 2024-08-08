package com.jbat.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author nidhal.ben-yarou
 */
@EnableScheduling
@SpringBootConfiguration
public class ApplicationLauncher {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationLauncher.class, args);
    }

    @Bean
    DummyTestRunner dummyTestRunner() throws InterruptedException {
        return new DummyTestRunner();
    }
}
