package com.cy.cloud.module.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cy.cloud.feign.entity.UserEntity;

import java.util.List;


public interface IUserService extends IService<UserEntity> {
    List<UserEntity> selectList();
}
