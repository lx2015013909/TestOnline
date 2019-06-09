package com.example.demo.controller;

import com.example.demo.entity.Eating;
import com.example.demo.service.EatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/eating")
@CrossOrigin // 需要跨域
public class EatingController {

    @Autowired
    private EatingService eatingService;



    @ResponseBody
    @PostMapping("/all")
    public List<Eating> selectAll() {

        List<Eating> eatings=eatingService.selectAll();
        return  eatings;
    }

    @ResponseBody
    @PostMapping("/select")
    public Eating selectAll(@RequestParam(value = "id") Integer id) {
        Eating eating=eatingService.selectById(id);
        return  eating;
    }

    @ResponseBody
    @PostMapping("/add")
    public int insert(@RequestParam(value = "title") String title,
                      @RequestParam(value = "leastprice") Integer leastprice,
                      @RequestParam(value = "travelprice") Integer travelprice,
                      @RequestParam(value = "price1") Integer price1,
                      @RequestParam(value = "price1down") Integer price1down,
                      @RequestParam(value = "price2") Integer price2,
                      @RequestParam(value = "price2down") Integer price2down,
                      @RequestParam(value = "price3") Integer price3,
                      @RequestParam(value = "image") String image) {
        return eatingService.insert(title,leastprice,travelprice,price1,price1down,price2,price2down,price3,image);

    }

    @ResponseBody
    @PostMapping("/delete")
    public int insert(@RequestParam(value = "id") Integer id) {
        return eatingService.deleteById(id);
    }

    @ResponseBody
    @PostMapping("/update")
    public int updateById(@RequestParam(value = "id") Integer id,
                          @RequestParam(value = "title")String title,
                          @RequestParam(value = "leastprice") Integer leastprice,
                          @RequestParam(value = "travelprice") Integer travelprice,
                          @RequestParam(value = "price1") Integer price1,
                          @RequestParam(value = "price1down") Integer price1down,
                          @RequestParam(value = "price2") Integer price2,
                          @RequestParam(value = "price2down") Integer price2down,
                          @RequestParam(value = "price3") Integer price3,
                          @RequestParam(value = "image") String image) {
        return eatingService.updateById(id,title,leastprice,travelprice,price1,price1down,price2,price2down,price3,image);
    }

}
