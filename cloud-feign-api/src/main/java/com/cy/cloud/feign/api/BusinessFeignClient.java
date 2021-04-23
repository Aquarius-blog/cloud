package com.cy.cloud.feign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(name = "cloud-module-business")
@RequestMapping("business")
public interface BusinessFeignClient {

    @GetMapping("api/test")
    String test();
}
