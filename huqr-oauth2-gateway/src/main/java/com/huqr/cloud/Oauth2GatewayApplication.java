package com.huqr.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author coderHqr
 * @date 2020/7/9 14:22
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Oauth2GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(Oauth2GatewayApplication.class, args);
    }
}
