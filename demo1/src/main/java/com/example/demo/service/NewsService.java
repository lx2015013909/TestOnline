package com.example.demo.service;

import com.example.demo.entity.News;
import com.example.demo.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsMapper newsMapper;


    public List<News> selectAll(){
        return newsMapper.selectAll();
    }
    public News selectById(Integer id){
        return newsMapper.selectById(id);
    }

    public Integer insert(String title,String textcontent){
        return newsMapper.insert(title,textcontent);
    }

    public Integer deleteById(Integer id){
        return newsMapper.deleteById(id);
    }

    public Integer updateById(Integer id,String title,String textcontent){
        return  newsMapper.updateById(id,title,textcontent);
    }
}
