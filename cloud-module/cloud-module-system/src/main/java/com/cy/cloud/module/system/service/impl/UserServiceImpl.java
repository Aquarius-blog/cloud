package com.cy.cloud.module.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cy.cloud.feign.entity.UserEntity;
import com.cy.cloud.module.system.mapper.IUserMapper;
import com.cy.cloud.module.system.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<IUserMapper, UserEntity> implements IUserService {
    @Override
    public List<UserEntity> selectList() {
        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        return baseMapper.selectList(wrapper);
    }
}
