package com.gewei.demo.service;

import com.gewei.demo.dao.DemoDao;
import org.springframework.stereotype.Service;

@Service
public interface DemoService {
     DemoDao getDemoDao();
}
