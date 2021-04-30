package com.cy.cloud.module.business.controller;

import com.cy.cloud.feign.api.BusinessFeignClient;
import com.cy.cloud.feign.api.SystemFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RefreshScope
@RestController
public class ConfigController {

    @Autowired
    SystemFeignClient systemFeignClient;

    @Value("${project.name:}")
    private String projectName;


    @Value("${common.name:}")
    private String commonName;



    @GetMapping("/config")
    public Map<String, Object> getConfig() {
        Map<String, Object> configMap = new HashMap();
        configMap.put("projectName", projectName);
        configMap.put("commonName", commonName);
        return configMap;
    }

    @GetMapping("test")
    public String test(){
        String test = systemFeignClient.test();
        System.out.println(test);
        return test;
    }
}
