package com.hongjl.jenkins_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author hongjinlin
 * @create 2019-08-22 15:40
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index/index");
        return modelAndView;
    }
}
