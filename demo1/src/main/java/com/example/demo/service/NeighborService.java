package com.example.demo.service;

import com.example.demo.entity.Neighbor;
import com.example.demo.mapper.NeighborMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeighborService {

    @Autowired
    private NeighborMapper userMapper;


    public List<Neighbor> selectAll(){
        return userMapper.selectAll();
    }

    public Integer insert(String username,String nickname,String headImage,String text){
        return userMapper.insert(username,nickname,headImage,text);
    }

    public Integer deleteById(Integer id){
        return userMapper.deleteById(id);
    }

}
