package com.cy.cloud.module.system.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RefreshScope
@RestController
public class ConfigController {

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
}
