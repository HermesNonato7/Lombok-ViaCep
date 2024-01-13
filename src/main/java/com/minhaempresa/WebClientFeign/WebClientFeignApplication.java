package com.minhaempresa.WebClientFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class WebClientFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebClientFeignApplication.class, args);
    }

}
