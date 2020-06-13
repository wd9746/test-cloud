package com.dt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudProviderGoods8003Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderGoods8003Application.class, args);
    }

}
