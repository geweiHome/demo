package com.gewei.demo.service.impl;

import com.gewei.demo.dao.DemoDao;
import com.gewei.demo.service.DemoService;
import org.springframework.stereotype.Service;

public class DemoServiceImpl implements DemoService {
    @Override
    public DemoDao getDemoDao() {
        DemoDao demoDao = new DemoDao();
        demoDao.setDemoDesc("测试Desc");
        demoDao.setDemoName("测试Name");
        demoDao.setDemoNo("测试No");
        return demoDao;
    }
}
