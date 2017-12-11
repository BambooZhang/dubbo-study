package com.bamboo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.bamboo.ProviderService;


@Service
public class ProviderServiceImpl implements ProviderService {  
  
    public String sayHello(String name) {         
        return "Hello:"+name+"你好，你好~~";  
    }  
  
}