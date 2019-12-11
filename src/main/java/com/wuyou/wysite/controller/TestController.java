package com.wuyou.wysite.controller;

import com.wuyou.wysite.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 心理测试
 *
 */
@Controller
public class TestController {

    @Autowired
    ProblemService problemService;

    @GetMapping("/add")
    public ModelAndView add(){
        return new ModelAndView("/add");
    }
}
