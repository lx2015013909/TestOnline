package com.example.demo.service;

import com.example.demo.entity.Plans;
import com.example.demo.mapper.PlanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanService {

    @Autowired
    private PlanMapper planMapper;


    public List<Plans> selectAll(){
        return planMapper.selectAll();
    }
    public Plans selectById(Integer id){
        return planMapper.selectById(id);
    }

    public Integer insert(String headtitle,String title,String textcontent,String image){
        return planMapper.insert(headtitle,title,textcontent,image);
    }

    public Integer deleteById(Integer id){
        return planMapper.deleteById(id);
    }

    public Integer updateById(Integer id,String headtitle,String title,String textcontent,String image){
        return  planMapper.updateById(id,headtitle,title,textcontent,image);
    }
}
