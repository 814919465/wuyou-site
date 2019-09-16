package com.wuyou.wysite.controller;

import com.wuyou.wysite.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 心理测试
 *
 */
@Controller
public class TestController {

    @Autowired
    ProblemService problemService;

}
