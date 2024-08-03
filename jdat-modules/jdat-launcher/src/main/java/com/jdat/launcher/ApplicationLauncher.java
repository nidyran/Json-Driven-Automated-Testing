package com.jdat.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

/**
 * @author nidhal.ben-yarou
 */
@SpringBootConfiguration
public class ApplicationLauncher {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationLauncher.class, args);
    }

}
