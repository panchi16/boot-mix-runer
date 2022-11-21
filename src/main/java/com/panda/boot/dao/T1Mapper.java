package com.panda.boot.dao;


import com.panda.boot.model.dto.T1DO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface T1Mapper {

    @Select("select * from T1 where id=#{id}")
    T1DO getById(Integer id);

}
