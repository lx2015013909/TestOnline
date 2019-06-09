package com.example.demo.controller;

import com.example.demo.entity.Pictures;
import com.example.demo.service.PicturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/pictures")
@CrossOrigin // 需要跨域
public class PicturesController {

    @Autowired
    private PicturesService picturesService;



    @ResponseBody
    @PostMapping("/all")
    public List<Pictures> selectAll() {

        List<Pictures> pictures=picturesService.selectAll();
        return  pictures;
    }

    @ResponseBody
    @PostMapping("/add")
    public int insert(@RequestParam(value = "name") String name,
                      @RequestParam(value = "url") String url) {
        return picturesService.insert(name, url);

    }

    @ResponseBody
    @PostMapping("/select")
    public Pictures selectAll(@RequestParam(value = "id") Integer id) {
        Pictures news=picturesService.selectById(id);
        return  news;
    }

    @ResponseBody
    @PostMapping("/delete")
    public int insert(@RequestParam(value = "id") Integer id) {
        return picturesService.deleteById(id);
    }

    @ResponseBody
    @PostMapping("/update")
    public int updateById(@RequestParam(value = "id") Integer id,
                          @RequestParam(value = "name")String name,
                          @RequestParam(value = "url")String url) {
        return picturesService.updateById(id,name,url);
    }

}
