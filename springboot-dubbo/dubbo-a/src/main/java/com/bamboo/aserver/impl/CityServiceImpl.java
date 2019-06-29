package com.bamboo.aserver.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bamboo.aserver.city.service.CityService;
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
public class CityServiceImpl implements CityService {
    private static final Logger logger = LoggerFactory.getLogger(CityServiceImpl.class);
    @Override
    public String getC(String name) {
        logger.debug("city service running :{}",name);
        return "city:"+name;
    }
}
