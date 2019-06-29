package com.bamboo.bserver.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bamboo.aserver.city.service.CityService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
    private CityService cityService;

    /**
     * default url
     */
    @GetMapping("/")
    public String find(Model model, String name) {
        return "bamboo  server";
    }


    @GetMapping("/city")
    public String getCity(Model model, String name) {
        return cityService.getC("bamboo");
    }


}