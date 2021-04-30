package com.cy.cloud.feign.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user")
public class UserEntity {

    private String id;
    private String name;
    private Integer age;
}
