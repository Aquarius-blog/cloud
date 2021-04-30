package com.cy.cloud.module.system.controller.api;


import com.cy.cloud.module.system.entity.UserEntity;
import com.cy.cloud.module.system.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("system/api")
public class SystemApiController {

    @Autowired
    IUserService userService;

    @GetMapping("get")
    public void get(){
        log.info("=======访问get方法=====");
        List<UserEntity> userEntities = userService.selectList(null);

        userService.
    }
}
