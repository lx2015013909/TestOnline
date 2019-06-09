package com.example.demo.controller;

import com.example.demo.entity.Plans;
import com.example.demo.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/plans")
@CrossOrigin // 需要跨域
public class PlanController {

    @Autowired
    private PlanService planService;



    @ResponseBody
    @PostMapping("/all")
    public List<Plans> selectAll() {

        List<Plans> plans=planService.selectAll();
        return  plans;
    }

    @ResponseBody
    @PostMapping("/select")
    public Plans selectAll(@RequestParam(value = "id") Integer id) {
        Plans plans=planService.selectById(id);
        return  plans;
    }

    @ResponseBody
    @PostMapping("/add")
    public int insert(@RequestParam(value = "headtitle") String headtitle,
                      @RequestParam(value = "title") String title,
                      @RequestParam(value = "textcontent") String textcontent,
                      @RequestParam(value = "image") String image) {
        return planService.insert(headtitle,title, textcontent,image);

    }

    @ResponseBody
    @PostMapping("/delete")
    public int insert(@RequestParam(value = "id") Integer id) {
        return planService.deleteById(id);
    }

    @ResponseBody
    @PostMapping("/update")
    public int updateById(@RequestParam(value = "id") Integer id,
                          @RequestParam(value = "headtitle") String headtitle,
                          @RequestParam(value = "title")String title,
                          @RequestParam(value = "textcontent")String textcontent,
                          @RequestParam(value = "image") String image) {
        return planService.updateById(id,headtitle,title,textcontent,image);
    }

}
