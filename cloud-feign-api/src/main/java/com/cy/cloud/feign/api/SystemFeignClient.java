package com.cy.cloud.feign.api;


import com.cy.cloud.feign.entity.UserEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@FeignClient(name = "cloud-module-system")
@RequestMapping("system")
public interface SystemFeignClient {

    @GetMapping("api/test")
    String test();

    @GetMapping("api/selectList")
    List<UserEntity> selectList();
}
