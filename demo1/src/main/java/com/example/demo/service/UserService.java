package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findByUsername(String username,String password)  {

     return   userMapper.findByUsername(username,password);
    }

    public List<User> selectAll(){
        return userMapper.selectAll();
    }

    public Integer insert(String username,String password,String headImage){
        return userMapper.insert(username,password,username,headImage);
    }

    public Integer deleteById(Integer id){
        return userMapper.deleteById(id);
    }

    public Integer updateById(Integer id,String nickname,String tel,String headImage){
        return  userMapper.updateById(id,nickname,tel,headImage);
    }
}
