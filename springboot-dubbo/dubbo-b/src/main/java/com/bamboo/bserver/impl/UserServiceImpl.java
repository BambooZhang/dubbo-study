package com.bamboo.bserver.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bamboo.bserver.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: dubbo-api
 * @description: 服务实现
 * @author: Bamboo zjcjava@163.com
 * @create: 2019-06-27 16:18
 **/
//注意，这里的service注解用的不是spring的注解，而是com.alibaba.dubbo.config.annotation.Service;
@Service
public class UserServiceImpl implements UserService{
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Override
    public String getUser(String name) {
        logger.debug("User service running :{}",name);
        return "user:"+name;
    }
}
