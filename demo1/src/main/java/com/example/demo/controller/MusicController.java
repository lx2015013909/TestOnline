package com.example.demo.controller;

import com.example.demo.entity.Music;
import com.example.demo.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/music")
@CrossOrigin // 需要跨域
public class MusicController {

    @Autowired
    private MusicService musicService;



    @ResponseBody
    @PostMapping("/all")
    public List<Music> selectAll() {

        List<Music> music=musicService.selectAll();
        return  music;
    }

    @ResponseBody
    @PostMapping("/select")
    public Music selectAll(@RequestParam(value = "id") Integer id) {
        Music music=musicService.selectById(id);
        return  music;
    }

    @ResponseBody
    @PostMapping("/add")
    public int insert(@RequestParam(value = "title") String title,
                      @RequestParam(value = "textcontent") String textcontent) {
        return musicService.insert(title, textcontent);

    }

    @ResponseBody
    @PostMapping("/delete")
    public int insert(@RequestParam(value = "id") Integer id) {
        return musicService.deleteById(id);
    }

    @ResponseBody
    @PostMapping("/update")
    public int updateById(@RequestParam(value = "id") Integer id,
                          @RequestParam(value = "title")String title,
                          @RequestParam(value = "textcontent")String textcontent) {
        return musicService.updateById(id,title,textcontent);
    }

}
