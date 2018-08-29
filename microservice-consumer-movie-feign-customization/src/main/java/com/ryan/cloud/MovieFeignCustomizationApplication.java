package com.ryan.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class MovieFeignCustomizationApplication {
    public static void main(String[] args) {
        SpringApplication.run(MovieFeignCustomizationApplication.class,args);
    }
}
