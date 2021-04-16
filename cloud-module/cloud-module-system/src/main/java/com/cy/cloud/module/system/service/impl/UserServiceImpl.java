package com.cy.cloud.module.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cy.cloud.module.system.entity.UserEntity;
import com.cy.cloud.module.system.mapper.IUserMapper;
import com.cy.cloud.module.system.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<IUserMapper, UserEntity> implements IUserService {
}
