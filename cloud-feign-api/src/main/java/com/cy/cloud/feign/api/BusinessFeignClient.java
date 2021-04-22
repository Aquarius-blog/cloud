package com.cy.cloud.feign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name = "cloud-module-business", path = "/business")
public interface BusinessFeignClient {

    @GetMapping("business/api/test")
    String test();
}
