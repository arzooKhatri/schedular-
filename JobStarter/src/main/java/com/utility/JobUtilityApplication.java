package com.utility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JobUtilityApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobUtilityApplication.class, args);
    }
}