package com.cy.cloud.module.system;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * @Description:
 * @author: chengyun
 * @date: 2021-04-16
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.cy.cloud.module.system.mapper")
@EnableFeignClients(basePackages = {"com.cy.cloud.feign.api"})
public class CloudModuleSystemApplication 
{
    public static void main(String[] args) {
        SpringApplication.run(CloudModuleSystemApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            log.info("Let's inspect the beans provided by Spring Boot:");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }

}
