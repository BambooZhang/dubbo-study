package com.bamboo.consumer;

import com.bamboo.ProviderService;
import com.reger.dubbo.annotation.Inject;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bamboo on 2017/12/11.
 */
@RestController
@Component//启动时调用
public class Consumer implements CommandLineRunner {

    // 使用兼容注入，可以使用dubbo原生注解@Reference注入
    @Inject
    public ProviderService service;
    // 使用兼容注入
    @Inject
    public ProviderService bidService;

    @Override
    public void run(String... args){
        String name="system start";
        System.out.println(service.sayHello(name));;
        System.out.println("调用完成");
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String  run(String name){

        name= name==null?"system start":name;

        return service.sayHello(name);
    }


}
