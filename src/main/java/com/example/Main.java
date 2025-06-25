package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Main implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Starting Spring Boot Application...");
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
        logger.info("Application started successfully.");
        // You can add any startup logic here
    }
}
