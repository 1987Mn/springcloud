package com.lzw.springcloud.dao;

import com.lzw.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptMapper {

    public Dept getOneById(Integer id);

    public List<Dept> getAll();

    public boolean addOne(Dept obj);

    public boolean delOne(Integer id);

}
