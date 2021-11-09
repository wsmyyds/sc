package com.example.gatewayserver8080;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 13450
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayServer8080Application {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServer8080Application.class, args);
    }

}
