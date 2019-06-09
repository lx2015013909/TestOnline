package com.example.demo.mapper;

import com.example.demo.entity.Plans;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PlanMapper {

    List<Plans> selectAll();
    Plans selectById(Integer id);
    Integer insert(String headtitle,String title, String textcontent,String image);
    Integer deleteById(Integer id);
    Integer updateById(Integer id, String headtitle,String title, String textcontent,String image);
}
