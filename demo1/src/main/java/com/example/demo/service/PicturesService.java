package com.example.demo.service;

import com.example.demo.entity.Pictures;
import com.example.demo.mapper.PicturesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PicturesService {

    @Autowired
    private PicturesMapper picturesMapper;


    public List<Pictures> selectAll(){
        return picturesMapper.selectAll();
    }
    public Pictures selectById(Integer id){
        return picturesMapper.selectById(id);
    }
    public Integer insert(String name,String url){
        return picturesMapper.insert(name,url);
    }

    public Integer deleteById(Integer id){
        return picturesMapper.deleteById(id);
    }

    public Integer updateById(Integer id,String name,String url){
        return  picturesMapper.updateById(id,name,url);
    }
}
