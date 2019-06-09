package com.example.demo.controller;

import com.example.demo.entity.News;
import com.example.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/news")
@CrossOrigin // 需要跨域
public class NewsController {

    @Autowired
    private NewsService newsService;



    @ResponseBody
    @PostMapping("/all")
    public List<News> selectAll() {

        List<News> news=newsService.selectAll();
        return  news;
    }

    @ResponseBody
    @PostMapping("/select")
    public News selectAll(@RequestParam(value = "id") Integer id) {
        News news=newsService.selectById(id);
        return  news;
    }

    @ResponseBody
    @PostMapping("/add")
    public int insert(@RequestParam(value = "title") String title,
                      @RequestParam(value = "textcontent") String textcontent) {
        return newsService.insert(title, textcontent);

    }

    @ResponseBody
    @PostMapping("/delete")
    public int insert(@RequestParam(value = "id") Integer id) {
        return newsService.deleteById(id);
    }

    @ResponseBody
    @PostMapping("/update")
    public int updateById(@RequestParam(value = "id") Integer id,
                          @RequestParam(value = "title")String title,
                          @RequestParam(value = "textcontent")String textcontent) {
        return newsService.updateById(id,title,textcontent);
    }

}
