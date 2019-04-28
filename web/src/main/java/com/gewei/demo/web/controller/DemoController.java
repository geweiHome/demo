package com.gewei.demo.web.controller;

import com.gewei.demo.dao.DemoDao;
import com.gewei.demo.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoController {

    @Resource
    protected DemoService demoService;
    @RequestMapping("/getDemo")
    public DemoDao getDemo(){
        return demoService.getDemoDao();
    }
}
