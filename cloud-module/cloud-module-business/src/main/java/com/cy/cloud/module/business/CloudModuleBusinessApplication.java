package com.cy.cloud.module.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description:
 * @author: chengyun
 * @date: 2021-04-16
 */
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.cy.cloud.feign.api"})
public class CloudModuleBusinessApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudModuleBusinessApplication.class, args);
    }

}
