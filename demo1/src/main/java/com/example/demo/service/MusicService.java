package com.example.demo.service;

import com.example.demo.entity.Music;
import com.example.demo.mapper.MusicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    private MusicMapper musicMapper;


    public List<Music> selectAll(){
        return musicMapper.selectAll();
    }
    public Music selectById(Integer id){
        return musicMapper.selectById(id);
    }

    public Integer insert(String title,String textcontent){
        return musicMapper.insert(title,textcontent);
    }

    public Integer deleteById(Integer id){
        return musicMapper.deleteById(id);
    }

    public Integer updateById(Integer id,String title,String textcontent){
        return  musicMapper.updateById(id,title,textcontent);
    }
}
