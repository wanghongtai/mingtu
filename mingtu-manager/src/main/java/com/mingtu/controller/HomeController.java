package com.mingtu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Hunter on 2020-07-03.
 */
@Controller
public class HomeController {


    @ResponseBody
    @RequestMapping("/")
    public String list(){
        return "Hello spring boot!";
    }

}
