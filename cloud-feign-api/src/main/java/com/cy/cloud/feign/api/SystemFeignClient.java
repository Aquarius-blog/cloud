package com.cy.cloud.feign.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(name = "cloud-module-system")
@RequestMapping("system")
public interface SystemFeignClient {

    @GetMapping("api/test")
    String test();
}
