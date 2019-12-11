package com.wuyou.wysite.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/fodian")
public class FodianController {

    /**
     * 目录
     * @return
     */
    @GetMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("fodian/index");
    }

    /**
     * 具体文章
     * @param index
     * @return
     */
    @GetMapping("/view/{index}")
    public ModelAndView view(@PathVariable String index){
        return new ModelAndView("fodian/" + index);
    }
}
