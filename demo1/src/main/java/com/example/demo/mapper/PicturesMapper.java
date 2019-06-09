package com.example.demo.mapper;

import com.example.demo.entity.Pictures;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PicturesMapper {

    List<Pictures> selectAll();
    Pictures selectById(Integer id);
    Integer insert(String name, String url);
    Integer deleteById(Integer id);
    Integer updateById(Integer id, String name, String url);
}
