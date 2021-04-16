package com.cy.cloud.module.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:
 * @author: chengyun
 * @date: 2021-04-16
 */
@SpringBootApplication
@MapperScan("com.cy.cloud.module.system.mapper")
public class CloudModuleSystemApplication 
{
    public static void main(String[] args) {
        SpringApplication.run(CloudModuleSystemApplication.class, args);
    }


}
