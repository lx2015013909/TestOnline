package com.example.demo.mapper;

import com.example.demo.entity.Eating;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EatingMapper {

    List<Eating> selectAll();
    Eating selectById(Integer id);
    Integer insert(String title, Integer leastprice,Integer travelprice,Integer price1,Integer price1down,Integer price2,Integer price2down,Integer price3,String image);
    Integer deleteById(Integer id);
    Integer updateById(Integer id, String title,Integer leastprice,Integer travelprice,Integer price1,Integer price1down,Integer price2,Integer price2down,Integer price3,String image);
}
