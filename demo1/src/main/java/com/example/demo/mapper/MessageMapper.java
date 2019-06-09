package com.example.demo.mapper;

import com.example.demo.entity.Message;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MessageMapper {

    List<Message> selectAll();
    Message selectById(Integer id);
    Integer insert(String title, String textcontent);
    Integer deleteById(Integer id);
    Integer updateById(Integer id, String title, String textcontent);
}
