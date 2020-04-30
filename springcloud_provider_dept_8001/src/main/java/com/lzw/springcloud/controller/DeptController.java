package com.lzw.springcloud.controller;

import com.lzw.springcloud.pojo.Dept;
import com.lzw.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;
import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/getAll")
    public List<Dept> getOne(){
        return deptService.getAll();
    }

}
