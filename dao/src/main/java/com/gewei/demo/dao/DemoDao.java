package com.gewei.demo.dao;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class DemoDao {
    private String demoName;
    private String demoNo;
    private String demoDesc;
}
