package com.cy.cloud.module.system.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cy.cloud.module.system.entity.UserEntity;
import com.cy.cloud.module.system.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);


    @Autowired
    IUserService userService;

    @RequestMapping("test")
    public void test(){
        logger.info("=======访问test方法=====");
       // List<UserEntity> userEntities = userService.selectList(null);
        QueryWrapper queryWrapper;
        for (int i = 0; i<2; i++){
            queryWrapper = new QueryWrapper();
            queryWrapper.eq("age",i);
            UserEntity one = userService.getOne(queryWrapper);
            System.out.println("user==="+one.getName());
        }

    }

    @PostConstruct
    public void init(){
        System.out.println("执行初始化方法@PostConstruct");
    }
}
