package com.huqr.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author coderHqr
 * @date 2020/7/9 14:32
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Oauth2ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2ApiApplication.class, args);
    }

}
