package com.example.demo.service;

import com.example.demo.entity.Message;
import com.example.demo.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageMapper messageMapper;


    public List<Message> selectAll(){
        return messageMapper.selectAll();
    }
    public Message selectById(Integer id){
        return messageMapper.selectById(id);
    }

    public Integer insert(String title,String textcontent){
        return messageMapper.insert(title,textcontent);
    }

    public Integer deleteById(Integer id){
        return messageMapper.deleteById(id);
    }

    public Integer updateById(Integer id,String title,String textcontent){
        return  messageMapper.updateById(id,title,textcontent);
    }
}
