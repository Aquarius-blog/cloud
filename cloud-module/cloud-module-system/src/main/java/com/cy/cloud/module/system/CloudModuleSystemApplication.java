package com.cy.cloud.module.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description:
 * @author: chengyun
 * @date: 2021-04-16
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.cy.cloud.module.system.mapper")
public class CloudModuleSystemApplication 
{
    public static void main(String[] args) {
        SpringApplication.run(CloudModuleSystemApplication.class, args);
    }


}
