package com.example.demo.controller;

import com.example.demo.entity.Neighbor;
import com.example.demo.service.NeighborService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/neighbor")
@CrossOrigin // 需要跨域
public class NeighborController {

    @Autowired
    private NeighborService userService;



    @ResponseBody
    @PostMapping("/all")
    public List<Neighbor> selectAll() {

        List<Neighbor> users=userService.selectAll();
        return  users;
    }

    @ResponseBody
    @PostMapping("/add")
    public int insert(@RequestParam(value = "username") String username,
                      @RequestParam(value = "nickname") String nickname,
                      @RequestParam(value = "headImage") String headImage,
                      @RequestParam(value = "text") String text ) {
        return userService.insert(username, nickname,headImage,text);

    }

    @ResponseBody
    @PostMapping("/delete")
    public int insert(@RequestParam(value = "id") Integer id) {
        return userService.deleteById(id);
    }


}
