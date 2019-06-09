package com.example.demo.mapper;

import com.example.demo.entity.Neighbor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface NeighborMapper {

    List<Neighbor> selectAll();
    Integer insert(String username, String nickname, String headimage, String text);
    Integer deleteById(Integer id);
}
