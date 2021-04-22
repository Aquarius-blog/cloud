package com.cy.cloud.feign.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name = "cloud-module-system", path = "/system")
public interface SystemFeignClient {

    @GetMapping("system/api/test")
    String test();
}
