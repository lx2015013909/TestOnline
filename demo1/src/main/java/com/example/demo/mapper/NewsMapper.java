package com.example.demo.mapper;

import com.example.demo.entity.News;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface NewsMapper {

    List<News> selectAll();
    News selectById(Integer id);
    Integer insert(String title, String textcontent);
    Integer deleteById(Integer id);
    Integer updateById(Integer id, String title, String textcontent);
}
