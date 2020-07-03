package com.mingtu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hunter on 2020-07-03.
 */
@RestController
public class HomeController {


    @RequestMapping("/")
    public String list(){
        return "Hello spring boot!";
    }

}
