package com.lzw.springcloud.service;

import com.lzw.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {

    public Dept getOneById(Integer id);

    public List<Dept> getAll();

    public boolean addOne(Dept obj);

}
