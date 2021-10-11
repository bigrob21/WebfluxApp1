package com.bigrob.webfluxwebapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.bigrob.controllers")
@SpringBootApplication
public class WebfluxWebApp1Application {

    public static void main(String[] args) {
        SpringApplication.run(WebfluxWebApp1Application.class, args);
    }

}
