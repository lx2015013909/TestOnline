package com.example.demo.controller;

import com.example.demo.entity.Message;
import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/message")
@CrossOrigin // 需要跨域
public class MessageController {

    @Autowired
    private MessageService messageService;



    @ResponseBody
    @PostMapping("/all")
    public List<Message> selectAll() {

        List<Message> news=messageService.selectAll();
        return  news;
    }

    @ResponseBody
    @PostMapping("/select")
    public Message selectAll(@RequestParam(value = "id") Integer id) {
        Message news=messageService.selectById(id);
        return  news;
    }

    @ResponseBody
    @PostMapping("/add")
    public int insert(@RequestParam(value = "title") String title,
                      @RequestParam(value = "textcontent") String textcontent) {
        return messageService.insert(title, textcontent);

    }

    @ResponseBody
    @PostMapping("/delete")
    public int insert(@RequestParam(value = "id") Integer id) {
        return messageService.deleteById(id);
    }

    @ResponseBody
    @PostMapping("/update")
    public int updateById(@RequestParam(value = "id") Integer id,
                          @RequestParam(value = "title")String title,
                          @RequestParam(value = "textcontent")String textcontent) {
        return messageService.updateById(id,title,textcontent);
    }

}
