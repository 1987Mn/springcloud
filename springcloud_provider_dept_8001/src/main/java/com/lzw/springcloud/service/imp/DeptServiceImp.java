package com.lzw.springcloud.service.imp;

import com.lzw.springcloud.dao.DeptMapper;
import com.lzw.springcloud.pojo.Dept;
import com.lzw.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImp implements DeptService {

    @Autowired
    public DeptMapper deptMapper;

    @Override
    public Dept getOneById(Integer id) {
        return deptMapper.getOneById(id);
    }

    @Override
    public List<Dept> getAll() {
        return deptMapper.getAll();
    }

    @Override
    public boolean addOne(Dept obj) {
        return deptMapper.addOne(obj);
    }

}
