package com.bamboo.aserver.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.bamboo.bserver.user.service.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * demo url
 * http://localhost:9001
 *
 * @author bamboo
 * @time 2019-6-27
 */
@RestController
public class BambooController {
    private Log logger = LogFactory.getLog(BambooController.class);

    @Reference
    private UserService userService;
    /**
     * default url
     */
    @GetMapping("/")
    public String index(Model model, String name) {
        return "bamboo server";
    }

    @GetMapping("/user")
    public String user(Model model, String name) {
        return userService.getUser("bamboo");
    }


}