package com.example.demo.service;

import com.example.demo.entity.Eating;
import com.example.demo.mapper.EatingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EatingService {

    @Autowired
    private EatingMapper eatingMapper;


    public List<Eating> selectAll(){
        return eatingMapper.selectAll();
    }
    public Eating selectById(Integer id){
        return eatingMapper.selectById(id);
    }

    public Integer insert(String title,Integer leastprice,Integer travelprice,Integer price1,Integer price1down,Integer price2,Integer price2down,Integer price3,String image){
        return eatingMapper.insert(title,leastprice,travelprice,price1,price1down,price2,price2down,price3,image);
    }

    public Integer deleteById(Integer id){
        return eatingMapper.deleteById(id);
    }

    public Integer updateById(Integer id,String title,Integer leastprice,Integer travelprice,Integer price1,Integer price1down,Integer price2,Integer price2down,Integer price3,String image){
        return  eatingMapper.updateById(id,title,leastprice,travelprice,price1,price1down,price2,price2down,price3,image);
    }
}
