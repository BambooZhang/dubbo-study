package com.bamboo.dubbo_provider;

import com.bamboo.service.ProviderService;

public class ProviderServiceImpl implements ProviderService {  
  
    public String sayHello(String name) {         
        return "Hello:"+name+"你好，你好~~";  
    }  
  
}