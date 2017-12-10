package com.bamboo.dubbo_consumer;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bamboo.service.ProviderService;

/**
 * dubbo 服务消费端
 * @author bamboo
 *
 */
public class App 
{
	public static void main(String[] args) {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "applicationConsumer.xml" });  
          
        context.start();  
        ProviderService providerService = (ProviderService) context.getBean("providerService");  
  
        System.out.println(providerService.sayHello("bamboo"));  
        System.out.println("Press any key to exit.");    
        try {
            System.in.read();  
        } catch (IOException e) {         
            e.printStackTrace();  
        }    
  
    }  
}
